/**
 * 22. Develop a program to copy file content
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("abc.txt"); 
		FileOutputStream fos = new FileOutputStream("bbc.txt");
		
		int data;
		while((data = fis.read()) !=-1 ) {
			fos.write(data);
		}
		System.out.println("File copied");
		
		fis.close();
		fos.close();
		
	}
}
