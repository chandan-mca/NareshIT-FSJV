/*
 * 6. What is the relation between String, StringBuffer and StringBuilder?
 * 	  can we assign one class object to another class variable?
 * 		- No, all these 3 classes are siblings 
 *      - because all these three classes' behavior and purpose are different
 *      - there is no IS-A relation means all three classes are independent classes 
 *      
 *      - But all these 3 classes are implementation classes of 
 *        CharSequence, Comparable and Serializable interfaces
 *        	
 *        					CharSequence
 *        
 *         	
 *         		String		StringBuffer	StringBuidler
 *      
 *       
 *       			Comparable		Serializable
 *       
 *    - We can assign string literal directly to string type of variable 
 *      but we cannot assign string literal to StringBuffer or StringBuilder type variable 
 *      because String, StringBuffer and StringBuilder classes are incompatible 
 *      there is no IS-A relation among them 
 *    
 *    - For a storing String object's sequence of characters in StringBuffer or 
 *      in StringBuilder objects String parameter constructor available in 
 *      StringBuffer and StringBuilder classes .
 *      
 * as shown in the below program
 *        
 */

public class Test03_Relation_bw_S_SB_SB {
	public static void main(String[] args) {
		
			String 			s1 	= "Hari";
//			StringBuffer 	sb1 = "Hari";  //CE: i c t String cannot be converted to SBuffer
//			StringBuilder 	sb2 = "Hari";  //CE: i c t String cannot be converted to SBuilder
			
			StringBuffer sb3 = new StringBuffer("Hari");
			StringBuilder sb4 = new StringBuilder("Hari");
			
			System.out.println(s1);
			System.out.println(sb3);
			System.out.println(sb4);
	}
}
