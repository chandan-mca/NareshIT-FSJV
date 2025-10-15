/**
 * Develop multi-thread application for running Bank operations 
 * deposit() and withdraw() concurrently from diff threads for diff users
 * 
 * execute deposit() operation for two customer in two different custom threads
 * and execute withdraw() operation for third customer in another custom thread
 * 
 * After deposit() and withdraw() operations completed print final balance
 * 
 */
//BankAcount.java
class BankAcount {
	
	private long accNum;
	private String accHName;
	private double balance;
	
	public BankAcount(long accNum, String accHName, double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public long getAccNum() {
		return accNum;
	}
	
	public void deposit(double amt) {
		this.balance = this.balance + amt;
		System.out.println(amt + " is credited to account "+ accNum);
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance - amt;
		System.out.println(amt + " is debited from account "+ accNum);
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}

	@Override
	public String toString() {
		return "BankAcount(" + accNum + ", " + accHName + ", " + balance + ")";
	}
	
}

class DepositerThread extends Thread {
	private BankAcount acc;
	private double     amt;
	
	public DepositerThread(BankAcount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		acc.deposit(amt);
	}
}

class WithdraweeThread extends Thread {
	private BankAcount acc;
	private double     amt;
	
	public WithdraweeThread(BankAcount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.withdraw(amt);
	}
}


public class Test11_BankProject {
	public static void main(String[] args) throws InterruptedException {
		
		BankAcount acc1 = new BankAcount(1234, "HK", 10000);
		BankAcount acc2 = new BankAcount(5678, "BK", 20000);
		BankAcount acc3 = new BankAcount(4321, "PK", 30000);
		
		System.out.println("Balance before transction");
		System.out.print("  acc1 current balance: "); acc1.currentBalance();
		System.out.print("  acc2 current balance: "); acc2.currentBalance();
		System.out.print("  acc3 current balance: "); acc3.currentBalance();
//		acc1.deposit(0);
//		acc2.deposit(0);
//		acc3.withdraw(0);

		DepositerThread dt1 = new DepositerThread(acc1, 5000);
		DepositerThread dt2 = new DepositerThread(acc2, 7000);
		WithdraweeThread wt1 = new WithdraweeThread(acc3, 4000);
		
		dt1.start();
		dt2.start();
		wt1.start();
		
		Thread.sleep(5000);
		
		System.out.println("Balance after transction");
		System.out.print("  acc1 current balance: "); acc1.currentBalance();
		System.out.print("  acc2 current balance: "); acc2.currentBalance();
		System.out.print("  acc3 current balance: "); acc3.currentBalance();
	}
}
