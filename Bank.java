//Company.java
class Bank {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		System.out.println("acc1 object is created");

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		if(acc1.isActive())
			System.out.println("acc1 is active");
		else
			System.out.println("acc1 is not active");
		
		//initializing object via setter methods
		acc1.setAccNum(12345);
		acc1.setAccHName("HK");
		acc1.setBalance(10000);  
		acc1.setActive(true);

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		if(acc1.isActive())
			System.out.println("acc1 is active");
		else
			System.out.println("acc1 is not active");
		
	}
}
