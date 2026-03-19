/**
 * Java 8v static implemented method in an interface
 * =================================================
 * 1. From Java 8v onwards we can create a static method inside interface with implementation body 
 * 
 * 2. A static implementation method is just used for creating a utility method 
 *    common to all implementation classes of this interface. 
 *    
 * 3. It is not meant for inheriting and not meant for allowing to override in implementation class
 *    
 * 4. Because interface static method is not inherited to its implementation class,
 *    inside implementation class we cannot call an interface static method 
 *    directly by its name or by using subclass reference or by using this keyword
 *    
 *    Below 4 ways are not allowed to call interface static method		
 *    		m1();
 *    		this.m1();
 *    		C9.m1();		
 *    		I4.super.m1();		
 *    
 * 5. An interface static implementation method we must call only by using interface name
 *         I4.m1();
 *         
 */
interface I4 {
	public static void m1() {System.out.println("SM m1 is executed from interface I1 "); }
	public default void m2() {System.out.println("DM m2 is executed from interface I1 "); }
}

class C9 implements I4 {
	void m3() {
//		m1();
//		this.m1();
//		I4.super.m1();
		
		I4.m1();
		
		m2();
		this.m2();
		I4.super.m2();
	}
}

/**
 * 6. An interface static method is not inherited to its implementation class and 
 *    it is not meant for overriding in the implementation class, but we can define 
 *    the interface static method in its implementation class, it is not considered 
 *    as overriding method it is considered this implementation class own method no CE
 * 
 * 7. To prove this method is not a overriding method either 
 * 		1. remove public or 
 * 		2. remove static or
 * 		2. change return 
 *   we will not get any compile time error, 
 *   
 *   if it is a overriding method we must get compiled error because while hiding or overriding a 
 *   method we cannot decrease accessibility modifier, we can not add or remove static modifier and 
 *   we cannot change return type 
 *     
 */

class C10 implements I4 {
	static void m1() { //it is not interface overriding method
						//it is C7 class own method, observe we did not add public
	}
	
	
//	void m2() { } //CE: because public is missing
					//this method the interface default method's overriding method 
}	

public class Test02_StaticMethod {
	public static void main(String[] args) {
		C9 c9 = new C9();
		c9.m3();
	}
}

/**
 * 
 * Q1) What are the differences between static and default methods in an interface?
 * 
 * 
 *
 * 
 * Q2) What are the differences between a concrete method and default implemented method?
 * 
 * 
 * 
 * 
 * Q3) What are the differences between a class static method and interface static method?
 * 
 * 
 * 
 */



























