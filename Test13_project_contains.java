/*
 * Develop a program to read name from keyboard
 * if it contains Hari print welcome 
 * else print error message 
 * 
 */

import java.util.Scanner;

public class Test13_project_contains {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = scn.nextLine();

		//if(name.contains("hari")) {
		if(name.toLowerCase().contains("hari")) {
			System.out.println("Welcome");
		}else {
			System.out.println("Who are you?");
		}
	}
}
