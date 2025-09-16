//Bank.java
import java.util.Scanner;
class Bank{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		BankAccount acc1 = new BankAccount();
		try{
			System.out.print("Enter balance: ");
			acc1.setBalance(scn.nextDouble());

			System.out.println("Current Balance: "+ acc1.getBalance());

		}catch(IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}








//in above program we have used try/catch 
	//1. for catching the exception thrown from setBalance() method
	//2. for stop terminating main method execution abnormally and
	//3. for dispalying error message on console in user understand way

//we also used e.getMessage() method, it is a predefined method available in
//IllegalArgumentException class. It reads and returns the error message available 
//in this exception object that is caught by catch block

//we used while loop for reexecuting the same code, when wrong values are passed
//in side loop we used break, for terminating loop, when correct value passed
