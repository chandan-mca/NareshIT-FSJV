/*
 * 7. How many ways we can create String object?
 * 		2 ways
 *  		1. By using String literal
 * 			2. By using new kw and constructor 
 * 
 * 8. What are the difference in above two approaches
 * 		2 differences
 * 			1. Number of objects creation and
 * 			2. String pooling
 * 
 *   #1: Number of objects creation
 * 		- in String literal approach 	
 * 				either [1 or 0] objects are created
 *   
 * 		- in Constructor approach 		
 * 				either [2 or 1] object is created
 * 
 *   	- if the same string literal is repeated, only one object is created
 *        when it was appeared first time in the program. When we repeatedly use 
 *        the same String literal, new objects are not created, all referenced 
 *        variables are pointing to the same old String literal object which was
 *        created from the first referenced variable.
 *   
 *   #2: String pooling
 *   	- grouping String literals for reusing them in next lines code
 *        without recreating repeatedly is called String pooling
 *        
 *      - String literal object comes under string pooling
 *      - new kw based String object does not come under string pooling
 *        
 * 	9. How can String pooling is implemented?
 * 		- by using collection object
 *  
 * 		- when literal object is appeared first time
 *         JVM verifies Whether this String literal object available in the pool 
 *         	- if not available it creates a new object stores in the pool, 
 *         	   returns the reference to the program 
 *         
 *         - if it is already available it directly returns the same object 
 *  
 */
public class Test04_String_objects {
	public static void main(String[] args) {
		
		String s1 = "Hari";				//1
		String s2 = new String("NiT");	//2
		
		String s3 = "Hari";				//0
		String s4 = new String("NiT");	//1
		
		String s5 = "NiT";				//0
		
		System.out.println(s1 == s3);	//true
		System.out.println(s2 == s4);	//false
		
	}
}
