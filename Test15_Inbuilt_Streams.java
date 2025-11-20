import java.io.IOException;

/**
 * 
 * System.in	-> for reading value from keyboard one byte [0-255] range
 * System.out	-> for printing normal text or value
 * System.err	-> for printing exception
 * 
 * int data = System.in.read();
 * System.out.println(message/exception);
 * System.err.println(exception/messege);
 * 
 * System.in.read() problems
 * 	1. can not read complete line at a time
 *  2. returns each byte as ASCII number
 *  
 * Solution: User BufferedReader.readLine() 
 */
public class Test15_Inbuilt_Streams {
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter data: ");
		int data1 = System.in.read();
		int data2 = System.in.read();
		int data3 = System.in.read();
		System.out.println(data1  + " " + (char) data1);
		System.out.println(data2  + " " + (char) data2);
		System.out.println(data3  + " " + (char) data3);
	}
}
