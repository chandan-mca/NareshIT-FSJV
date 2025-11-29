/*
 * IOStreams[File IO, Serialization, File class]
 * ==============================================
 * 01. Need of this chapter?
 * - In this chapter we will learn storing data and reading data permanently from a file
 * 
 * - Storing data in a variable or in an array object or in a class object is temporary
 * 
 * - Because the values stored in a variable or in an array object or in a class object are 
 *    available only until program execution. Once a program execution is completed the 
 *    variables and objects memory is destroyed then the values stored in those variables and 
 *    objects are lost
 *   
 * - For storing values permanently we must save them either inside a file or inside a database 
 * 
 * - In this chapter we will learn storing values inside a file permanently   
 * 
 * 02. How can we store data in a file?
 * 		1. We must connect to a file from a Java program in which we want to store data
 *      2. We must write data into this file from the Java program   
 *
 * 03. How can we read data from the file that we saved permanently? 
 * 		1. We must connect to the file from a Java program from which we want to read data 
 *      2. We must read data from this file in the Java program   
 *  
 * 04. How can we connect to a file from a Java program?
 * 		by using a 'stream' object
 * 
 * 05. What is a stream?
 * 		A stream is a logical connection between Java program and a file 
 *      through which we can write data and we can read data permanently from a file
 *      
 *         
 *         	Java Program                         file(abc.txt)
 *            var/obj
 *                         ___________________             
 *              data  <<<_________________________>>>>
 *         				   ___________________
 *         
 * 06. By using single stream can we do both operation right and read?
 * 		No, we must have two separate streams 
 * 			- one for writing data 
 * 			- second for reading data
 * 
 *     - Writing data into a file technically called output 
 *     - Reading data from the file is technically called input
 *     
 *     - The stream that is used for writing data into a file is called output stream 
 *     - The stream that is used for reading data from a file is called input stream 
 *        
 *        
 * 07. In which format the data can flow through the stream?
 * 		- The data can flow through the streams only 
 *        either as bites or as characters   
 *        
 * 08. How many types of stream does Java support?
 * 		- Based on the type of data flow,
 *        Java supports two types of streams
 *        
 *         	1. Binary streams 
 *          2. Character streams 
 *          
 *       - By using binary streams we can write and read data in terms of bits 
 *       - By using character streams we can write and read data in terms of characters    
 *          
 *       - By using binary streams and characteristics we can write data also we can read data 
 *         based on the writing and reading operation both binary streams and characteristics 
 *         are further divided into two types
 *         
 *         Binary streams
 *          	1. Binary output stream 
 *          	2. Binary input string 
 *          
 *        Character streams
 *        		1. Character output stream 
 *        		2. Character input stream 
 *        
 * 09. Through binary streams what type of data we can write and read ?
 * 		- We can write and read to all types of data 
 *        numbers, characters, objects, images  
 *        
 * 10. Why character streams are available, when we can write and read characters 
 *     by using binary streams ?       
 *   	- Binary streams unable to convert them properly in some cases 
 *         like escape sequence characters, unicode characters etc...
 *         
 *      - Hence character streams are given as alternative to binary streams 
 *        for writing and reading characters from the file 
 * 
 * 11. When to use binary streams and when to use character streams?
 * 		- Binary streams  for writing and reading binary data numbers objects and images 
 *      - Character streams for writing and reading character data like text file 
 *
 * 12. From which java version binary streams and character streams are available?
 * 		- Binary streams are available from Java 1.0 version itself 
 * 		- Character streams are provided newly in Java 1.1 version
 * 
 *     ===================================================================
 * 					     Binary Streams
 * 
 * 		Binary Input Steam	 		Binary Output Steam
 * 	 
 *     ===================================================================
 * 					     Character Streams
 * 
 * 		Character Input Steam	 		Character Output Steam
 *     ===================================================================
 * 
 * 13. How can we represent streams in Java?
 * 		- In 'java.io' package we have input stream and output stream representing classes 	  	 
 *      
 *      - For representing 'binary input stream and binary output stream'
 *        we have 2 classes 
 *      	1. InputStream	 -> For reading value from the file as bits 
 *      	2. OutputStream  -> For writing value to a file as bits 
 *      
 *      - For representing 'character input stream and character output stream'
 *        we have 2 classes 
 *      	1. Reader		-> For reading value from the file as characters 
 *      	2. Writer		-> For writing value to the file as characters 
 *      
 *     ===================================================================
 * 					     Binary Streams
 * 
 * 			   InputStream	 		OutputStream
 * 	 
 *     ===================================================================
 * 					     Character Streams
 * 
 * 					Reader	 		writer
 *     ===================================================================
 *      
 * 14. What are the 'sources and destinations' for reading data and writing data 
 *     by using streams?
 *     	- By using stream we can read and write data 
 *     		1. from a file
 *     		2. from an object
 *     		3. from a socket (network computer)
 *			etc...
 *
 * 15. Can single class 'InputStream or OutputStream' or 'Reader or Writer' 
 *     can read and write data from all about different sources and destinations?
 *     	- No, a single class cannot represent all different sources and destinations
 *      - We have separate class to represent each source and destination 
 *        one class for reading and another writing for each source and destination separately
 *        
 * 16. InputStream and OutputStream sub classes?
 * 		InputStream								OutputStream
 * 			|-> FileInputStream						|-> FileOutputStream
 * 			|-> DataInputStream						|-> DataOutputStream
 * 			|-> ObjectInputStream					|-> ObjectOutputStream
 * 			|										|-> PrintStream
 * 			|-> InputStreamReader					|-> OutputStreamWriter
 *                    								
 * 17. Reader and Writer sub classes?
 * 		Reader									Writer	
 * 			|-> FileReader							|-> Filewriter
 * 			|-> BufferedReader						|-> BufferedWriter
 *                    								|-> PrintWriter
 *                    
 * 18. How can we write and read data from the file by using above stream classes ?
 * 		- In the InputStream class and in Reader class 
 *        we have a method read() for reading data from the file
 *        	public int read()                    
 *                    
 * 		- In the OutputStream class and in Writer class 
 *        we have a method write() for writing data to the file
 *        	public void write(int i)                    
 *                    
 * 19. What are the steps we must develop in the program for  
 *     writing and reading data from a file
 *     	1. Create intput stream or output object connecting to the file 
 *         based on the operation read() or write() we want to perform
 *         
 *      2. Invoke read() or write() method either for 
 *         reading data or writing data from the stream connected file
 *         
 *         writing data
 *             Java Program
 *               1. create FOS object 
 *             	 2. call fos.write(data) ----------------->  abc.txt
 *             
 *         reading data
 *         	   Java Program
 *         		1. create FIS object
 *              2. int data = fis.read() <----------  abc.txt
 *              
 * 20. Develop a program to write data into a file abc.txt from a Java program              
 *                         
 */

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01_FOS {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	  //temporary data	
		int i1 = 10;
		
		int[] ia = {10, 20, 30, 40, 50};
		
		Example e1 = new Example(10, 20);

		
		//for storing data permanently we must user FOS
		
		//1. stream connection is created to abc.txt for writing data
		FileOutputStream fos = new FileOutputStream("abc.txt");
	
		//2. saving or writing data to a file abc.txt
		fos.write(5);
		fos.write(97);
		fos.write('b');
		//fos.write("HK");
		fos.write("HK".getBytes());
		//fos.write(5L);
		//fos.write(5F);
		//fos.write(5D);
		//fos.write(true);
		fos.write(200);
		fos.write(300);		//1 byte means [0-255]
		fos.write(-15);		//1 byte means [0-255]
		
		System.out.println("data is saved");
		
	}

}
