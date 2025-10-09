package com.nit.hk.ao.main;

import com.nit.hk.ao.additive.Add;
import com.nit.hk.ao.additive.Sub;
import com.nit.hk.ao.multiplicative.Mul;
import com.nit.hk.ao.multiplicative.Div;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		System.out.println("========== Calc start =============== ");	
		Scanner scn = new Scanner(System.in);
		
		loop: while(true) {
			System.out.println("\nChoose one option");
			System.out.println(" 1. Add");
			System.out.println(" 2. Sub");
			System.out.println(" 3. Mul");
			System.out.println(" 4. Div");
			System.out.println(" 5. Exit");
			
			System.out.print("Enter option number: ");
			int option = scn.nextInt();
			
			switch(option) {		
			
				case 1: {
					System.out.print("Enter FNO: ");
					int a = scn.nextInt();
					
					System.out.print("Enter SNO: ");
					int b = scn.nextInt();
					
					Add.add(a, b);
					break;
				}
				case 2: {
					System.out.print("Enter FNO: ");
					int a = scn.nextInt();
					
					System.out.print("Enter SNO: ");
					int b = scn.nextInt();

					Sub.sub(a, b);
					break;
				}
				case 3: {
					System.out.print("Enter FNO: ");
					int a = scn.nextInt();
					
					System.out.print("Enter SNO: ");
					int b = scn.nextInt();

					int mulRes = Mul.mul(a, b);
					System.out.printf("The multiplication of %d and %d is %d\n", a, b, mulRes);	
					break;
				}
				case 4: {
					System.out.print("Enter FNO: ");
					int a = scn.nextInt();
					
					System.out.print("Enter SNO: ");
					int b = scn.nextInt();

					int divRes = Div.div(a, b);
					System.out.printf("The division of %d and %d is %d\n", a, b, divRes);	
					break;	
				}
				case 5: {
					System.out.println("===== Thank You, Visit Again ====");	
					break loop;	
				}
				default: {
					System.out.println("Invalid option");
				}
			}//switch close
			
		}//while(true) close
		
	}//main close
		
}//class close
