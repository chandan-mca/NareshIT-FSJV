public class BankAccount {
	
	private long accNum;
	private String accHName;
	private double balance;
	private boolean active;
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void display(){
		System.out.println("  accNum\t: "	+ accNum);
		System.out.println("  accHName\t: "	+ accHName);
		System.out.println("  balance\t: "	+ balance);
		System.out.println("  active\t: "	+ active);
	}
}
