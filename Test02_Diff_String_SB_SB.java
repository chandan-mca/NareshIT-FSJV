/*
 * 4. Diff b/w String, StringBuffer and StringBuilder?
 *    - String object
 * 		- String is an immutable sequence of characters object 
 * 		- It means once we store characters in string object 
 *        we cannot modify them in the same object
 *      - If we try to modify the characters in the string object, 
 *        the modification are not stored in the same current object,
 *        those modification are stored in new String object, 
 *        then that new string object is returned with result
 *      - Hence string object is called immutable. 
 *      - Immutable means not changeable in the same current object 
 *      - Hence After modification if you read String object data with the 
 *        existing reference variable s1, we will get original data, 
 *        but not modified data
 *         
 *   - StringBuffer object
 *   	- StringBuffer is a thred-safe mutable sequence of characters object
 *   	- It means if you modify characters in the StringBuffer object 
 *        the result is stored in the same current StringBuffer object, 
 *        new object is not created
 *      - After modification if you read StringBuffer object with existing 
 *        reference variable sb1, we will get modification results 
 *        but not original data 
 *        
 *        
 *   - StringBuilder object
 *   	- StringBuilder is available from Java 5v as alternative to StringBuffer 
 *        class for improving performance, for fast execution
 *   	- Because StringBuffer is thread-safe, it gives less performance in 
 *        single thread model application and in method local operations
 *        because of locking and unlocking objects
 *      - StringBuilder is given as non thread-safe object, so that 
 *        locking and unlocking will not be there, execution is fast
 *          
 *   	- StringBuilder is a non thread-safe mutable sequence of characters object
 *   	- It means if you modify characters in the StringBuilder object 
 *        the result is stored in the same current StringBuilder object, 
 *        new object is not created
 *      - After modification if you read StringBuidler object with existing 
 *        reference variable sb2, we will get modification results 
 *        but not original data 
 *         
 * 5. What are String, StringBuffer and StringBuilder?
 * 		1. A string is an immutable sequence of characters object
 * 		
 * 		2. A StringBuffer is a thread safe mutable sequence of characters object
 *    	   suitable to use in multi-threaded application
 *    	
 * 		3. A StringBuilder is a non-thread safe mutable sequence of characters object
 *         suitable to use in single thread application or in method local operation
 * 
 *   	4. We must use StringBuffer for storing mutable sequence of characters 
 *         at the class level common to all methods in multi-thread model application
 *         
 *   	5. We must use StringBuidler for storing mutable sequence of characters 
 *         inside a method specific to operation or in single thread model application
 *         at class level
 *         
 */
public class Test02_Diff_String_SB_SB {
	public static void main(String[] args) {
			String s1 = new String("HK"); //immutable object
			System.out.println(s1); //HK

			s1.concat("NiT"); 
					//concat method does not store given argument characters
					//in the current object that is s1 pointing object
				//it creates new String object with the characters "HKNiT" 
			//and returns that new object to our program
			//because we have not stored that returned object, it is destroyed
			//the s1 variable still pointing to the old string object "HK"
			
			System.out.println(s1);//HK
			System.out.println();
		//=============================================================================	
			StringBuffer sb1 = new StringBuffer("HK");  //mutable object
			System.out.println(sb1); //HK
			sb1.append("NiT");	//append method stores the arguemnt String object 
					//characters in this current StringBuffer object at the end of
					//existing characters and returns the result
			System.out.println(sb1);//HKNiT
			System.out.println();
		//=============================================================================
			
			StringBuilder sb2 = new StringBuilder("HK");  //mutable object
			System.out.println(sb2); //HK
			sb2.append("PW");	//append method stores the argument String object 
					//characters in this current StringBuilder object at the end of  
					//existing characters and returns the result
			System.out.println(sb2);//HKPW
			
			
	}
}
