/*
 * String Handling
 * ===============
 * 	
 * 1. Need of this chapter?
 * 	- We will learn storing string (text) data in a Java program and 
 *    performing different operations on string data by using 
 *    3 predefined classes
 *    	1. String 
 *    	2. StringBuffer 
 *    	3. StringBuilder
 *    
 * 2. The operations we perform on a String data are like 
 *    comparing, searching, retrieving, replacing, concatenating, 
 *    changing case, etc... operations    
 *     
 * 3. For storing names or alphanumeric data we will use String data type
 * 		For example:
 * 			For storing 
 * 				  student name, student course, emp dept, 
 *                alpha numeric data pan, bikenumber
 *          we must use String object 
 */
public class Test01_Need_SH {
	public static void main(String[] args) {
		String 			s1 	= new String("Hari");
		StringBuffer 	sb1 = new StringBuffer("Hari");
		StringBuilder 	sb2 = new StringBuilder("Hari");
		
		System.out.println(s1);	//Hari
		System.out.println(sb1);//Hari 
		System.out.println(sb2);//Hari
	}
}
