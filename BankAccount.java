//Develop BankAccount application by encapsulating balance variable
//also develop validation to stop storing -ve values and zero

//BankAccount.java
class BankAccount{

	private double balance;

	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance <= 0)
			throw new IllegalArgumentException("Donot pass -ve balance");

		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}
}

//in above program 
	//throw is used for throwing an exception, when wrong values are passed

	//throws is used for reporting or informing the thrown exception to this method caller
		//then by seeing throws Exception, this method caller will come to know that 
		//this method is throwing an Exception, hence he will catch that exception by using try/catch
		//in this code when he calls this method.

