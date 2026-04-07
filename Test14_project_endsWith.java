/*
 * Develop a program to find the file type
 * if it text file, print text file
 * else print not a text file
 */
import java.util.Scanner;

public class Test14_project_endsWith {
	public static void main(String[] args) {
/*		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter file: ");
		String name = scn.nextLine();
		
		//if(name.toLowerCase().contains(".txt")) {
		if(name.toLowerCase().endsWith(".txt")) {
			System.out.println(name + " is text file");
		}else {
			System.out.println(name + " is not a text file");
		}
*/		
		//String ext = ".txt";
		//String ext = ".doc";
		//String ext = ".pdf";
		String ext = ".xls";
		int filesCount = countFiles(
							new String[] {"a.txt", "b.doc", "c.pdf", "d.txt", "e.doc"}, 
							ext);
		System.out.println("\nNubmer of "+ext+" files available are " + filesCount); 
			
	}
	
	static int countFiles(String[] fileNamesArray, String ext) {
		int count = 0;
		
		for(String fileName : fileNamesArray) {
			if(fileName.toLowerCase().endsWith(ext)) {
				count++;
			}
		}
		
		return count;
	}
}
