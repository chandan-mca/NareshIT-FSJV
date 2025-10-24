/*
 * Develop login validator program to verify the entered username and password
 * if username is "hari" and password is "NiT" allow login
 * else throw error 
 * 
 */

import java.util.Scanner;

public class Test12_project_eq_eqI {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = scn.nextLine();
		
		System.out.print("Enter password: ");
		String password = scn.nextLine();
		
		//if(username=="hari" && password=="NiT") {	//reference comparison (wrong approach)
		//if(username.equals("hari") && password.equals("NiT")) { //username must compare without case
		if(username.equalsIgnoreCase("hari") && password.equals("NiT")) {//we mustuse eIgC() for username comparison
			System.out.println("Welcome to Naresh i Technologies");
		}else {
			System.out.println("Invalid username or password");
		}
		
	}
}
