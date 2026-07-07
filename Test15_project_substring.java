/*
 * Develop a program to read a text from the keyboard
 * find whether it contains hari or not, 
 * if available retrieve it and print it on console, 
 * else print error message
 * 
 */
import java.util.Scanner;

public class Test15_project_substring {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("\nEnter text: ");
			String text = scn.nextLine();
			String textLowerCase = text.toLowerCase();
			
			int index = textLowerCase.indexOf("hari");
			if(index != -1) {
				int end   = index + 4;
				String hari = text.substring(index, end);
				System.out.println(hari + " is available");
			}else {
				System.out.println("hari is not available");
			}
		}
	}
}
