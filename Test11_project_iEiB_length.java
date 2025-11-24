
import java.util.Scanner;
/**
 * Read mobile number and verify its length
 * if it is less than 10 throw error 
 * 
 */
public class Test11_project_iEiB_length {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter mobile number: ");
		String mobileNumber = scn.nextLine(); //reading mobile number as string
		
		//if(mobileNumber.isEmpty()) {				//6v
		//if(mobileNumber.trim().isEmpty()) {		//6v
		if(mobileNumber.isBlank()) {				//11v
			System.out.println("Mobile number cannot be empty");
		}
		else if(mobileNumber.length()!=10) {
			System.out.println("Mobile number must have 10 digits");
		}else {
			System.out.println("valid mobile number");
		}
	}
}
