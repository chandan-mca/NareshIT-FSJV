/**
 * 01. What is a wrapper class? 
 * - A predefined class that represents a primitive value as an object 
 *   is called wrapper class. 
 *   
 * 02. Why wrapper class?
 * 	- A wrapper class is used for representing primitive value as an object and 
 *    further it is used for passing as an argument or for returning a  
 *    a primitive value from a method whose parameter and return type is object
 *     
 *    For example if you want to store primitive value in the collection and if 
 *    you want to retrieve primitive value from a collection, we must use wrapper 
 *    class. Collection does not accept primitive values directly.
 *     
 * 03. How many wrapper classes do we have in Java
 * 		- we have 8 wrapper classes for 9 PDTs
 * 	======================================================================
 * 			PDTs				WCs				super class
 * 	======================================================================
 * 		1. byte					Byte-------\    
 * 		2. short 				Short-------\		
 * 		3. int 					Integer------>	Number --------> Object
 * 		4. long 				Long--------/   				  |	
 * 		5. float 				Float------/					 /
 * 		6. double				Double----/ 					/
 * 		7. char 				Character----------------------/
 * 		8. boolean				Boolean-----------------------/
 *                                                           /
 * 		9. void 				Void------------------------/	
 * 	==================================================
 * 
 * 04. What is the structure of each wrapper class , what it contains?    
 *      1. Every wrapper class contains one instance field 
 *        of this wrapper class matching primitive type for storing 
 *        single primitive value.
 *        
 *      	- It means 
 *      		in Integer class we have int type variable 
 *          	in Double class we have double type variable 
 *          	in Character class we have char type variable etc 
 *        	for storing the primitive value inside the wrapper class object 
 *       
 *       2. For initializing wrapper class object, 
 *          in every wrapper class we have primitive type parameter constructor
 *          
 *         		- It means  
 *      			in Integer class we have Integer(int value) constructor 
 *          		in Double class we have Double(double value)  constructor
 *          		in Character class we have Character(char value) constructor
 *          
 *       3. In every wrapper class we have several methods 
 *          to perform different operations on the stored primitive value  
 *  
 * 05. In which a package wrapper classes are available?
 *  	- All wrapper classes are available in java.lang package 
 *        in Java.base module 	
 *  
 * 06. What are the different operations we can perform by using wrapper class 
 *     on a primitive type value?
 *     
 *     - Basically wrapper classes are used for performing conversion operations 
 *     - By using wrapper class we can perform 6 conversion operations
 *     ==========================================================================
 *         Conversions        Examples      Constructors     Methods
 *     ==========================================================================
 *        1. PV  to WCO		5 	 -> I(5)	  WC(pdt)		static valueOf(pdt)	
 *        2. WCO to PV	    I(5) -> 5
 *        3. PSO to WCO     "5"  -> I(5)
 *        4. PSO to PV		"5"	 -> 5                   	
 *        5. WCO to PSO		I(5) -> "5"                   	
 *        6. PV  to PSO		5    -> "5"                   	
 *     ==========================================================================
 *     
 * 07. Below program explains converting PV to WCO
 * 	   In all 8 wrapper classes, we have primitive data type parameter
 *       constructor and static valueOf() factory method 
 *     for converting primitive value to wrapper class object
 *      
 *       For example:				
 *       	Byte(byte b)			public static Byte valueOf(byte b)
 *       	Short(short b)			public static Short valueOf(short b)
 *       	Integer(int b)			public static Integer valueOf(int b)
 *       	Long(long b)			public static Long valueOf(long b)
 *       	Float(float/double b)	public static Float valueOf(float/double b)
 *       	Double(double b)		public static Double valueOf(double b)
 *       	Character(char b)		public static Character valueOf(char b)	
 *       	Boolean(boolean b)		public static Boolean valueOf(boolean b)
 *       
 * 08. In Java 9v, in all wrapper classes all above 8 constructors are deprecated
 *     and suggested us to use factory method valueOf(-) for better performance
 *     because valueOf() does not create new object always it applies pooling and
 *     reuses old object 
 *        
 */
import java.util.ArrayList;

public class Test01_PVtoWCO {
	public static void main(String[] args) {
		
		int i1 = 50;					//PDT int 
		
		//converting PV -> WCO
	//============================================================	
		Integer io1 = new Integer(50);		
		Integer io2 = Integer.valueOf(50);	
		
		System.out.println(io1);
		System.out.println(io2);
	//============================================================	
		ArrayList<Object> al = new ArrayList<>();
//		al.add(new Integer(50));
//		al.add(new Double(50.0));
//		al.add(new Character('a'));
//		al.add(new Boolean(true));

		al.add(Integer.valueOf(50));
		al.add(Double.valueOf(50.0));
		al.add(Character.valueOf('a'));
		al.add(Boolean.valueOf(true));
	//============================================================
//		Byte b1 = new Byte(5);
//		Byte b2 = Byte.valueOf(5);
//
//		Short s1 = new Short(5);
//		Short S2 = Short.valueOf(5);

//		Character c1 = new Character(97);
//		Character c2 = Character.valueOf(97);
	//============================================================

		Byte b1 = new Byte((byte)5);
		Byte b2 = Byte.valueOf((byte)5);
		
		Short s1 = new Short((short)5);
		Short S2 = Short.valueOf((short)5);
	
		Character c1 = new Character((char)97);
		Character c2 = Character.valueOf((char)97);
		
		Float f1 = new Float(5);
		Float f2 = new Float(5.7); //allowed
		Float f3 = new Float(5.7f); 
		
		
		
	}
	
	
}
