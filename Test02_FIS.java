/**
 * 21. Develop a program to read data from a file abc.txt               
 *    
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_FIS {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//1. Create FIS object connecting to abc.txt for reading data
		FileInputStream fis = new FileInputStream("abc.txt");
		
		//2. reading data from the file abc.txt
//		int data1 = fis.read();  //5
//		int data2 = fis.read();  //97
//		int data3 = fis.read();  //-1
//		System.out.println("data1: "+ data1);
//		System.out.println("data2: "+ data2);
//		System.out.println("data3: "+ data3);

		int data;
		while((data = fis.read()) != -1 ) {
			System.out.println(data);		
		}
		
		
	}
}
