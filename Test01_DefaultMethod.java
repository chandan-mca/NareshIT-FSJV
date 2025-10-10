/**
 * Default implemented method
 * ==========================
 * 1. A method with implementation body in interface is called default implemented method
 * 
 * 2. In Java 8v default implemented method is given for adding new functionality methods 
 *    in the interface without forcing sub types to implement those methods
 * 
 * 3. To create default implemented method, we must declare it by using the keyword 'default' 
 *    else will get compile time error 
 *    
 * 4. Overriding or implementing default implemented method in 
 *    interface implementation classes is optional       
 *    
 * 5. The default implemented method of an interface is inherited 
 *    to its implementation classes. Then we can access and reuse this 
 *    default implemented method logic by using implementation class object reference   
 *      
 */
interface I1 {
	public abstract void m1();
	public abstract void m2();
	
	public default void m3() { 
		System.out.println("m3 is executed from interface I1 for "+ this + " object");
	}
}

class C1 implements I1{
	
	@Override
	public void m1() {
		System.out.println("m1 is executed from class C1");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 is executed from class C1");
	}
	
}

class C2 implements I1 {
	@Override
	public void m1() {
		System.out.println("m1 is executed from class C2");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 is executed from class C2");
	}
}

public class Test01_DefaultMethod {
	public static void main(String[] args) {
		I1 i1 ;
		
		i1 = new C1();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();
		
		i1 = new C2();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();
		
		i1 = new C3();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();

		i1 = new C4();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println();

		C6 c6 = new C6();
		c6.m5();
		
		/**/
	}
}

/*
 * 6. We can override default implemented method in 
 *    implementation classes to provide new implementation logic  
 * 
 * 7. While overriding default method, in the implementation class 
 *    we must not use the keyword 'default', because it specific to this sub class
 *    we must use the modifier 'public', because interface methods are by default public   
 *    
 * 8. When we override default method and when we call it,
 *    it is executed only from implementation class    
 *    
 * 9. If we want to execute default implemented method from both interface and 
 *    its implementation class, we must invoke this default implemented method 
 *    in implementation class by using super keyword
 *    
 * 10. The syntax for calling default implemented method from its overriding method  
 *     or from normal method is: 
 * 			InterfaceName.super.method(args);
 * 
 * 		For example:
 * 			I1.super.m3();
 */

class C3 implements I1{
	@Override
	public void m1() {
		System.out.println("m1 is executed from class C3");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 is executed from class C3");
	}
	
	@Override
	public void m3() {
		System.out.println("m3 is executed from class C3"); 
	}
}

class C4 implements I1 {
	@Override
	public void m1() {
		System.out.println("m1 is executed from class C4");
	}
	
	@Override
	public void m2() {
		System.out.println("m2 is executed from class C4");
	}
	
	@Override
	public void m3() {
		I1.super.m3();
		System.out.println("m3 is executed from class C4");
		I1.super.m3();
	}
}

/*
 * 11. The default implemented method again introduced ambiguous error to the interfaces also 
 * 
 * 12. If a class implements multiple interfaces, if more than two interfaces have same signature 
 *     default method, then the implementation class gets compile time error 'ambiguous error' 
 *     
 * 13. To solve these ambiguous error we must override this default method in the implementation class 
 * 
 * 14. If you want execute this default method logic from the interfaces, 
 *     we must call this default method by using 'interfacename.super.method()'
 *          
 */
interface I2 {
	default void m5(){ System.out.println("m5 is executed from interface I2"); }
}

interface I3 {
	default void m5() { System.out.println("m5 is executed from interface I3");  }
}

//class C5 implements I2, I3 { } //CE: a e

class C6 implements I2, I3 { //solution to CE: a e is
							//override default implemented method
	@Override
	public void m5() {
		System.out.println("m5 is executed from class C5");
		I2.super.m5();
		I3.super.m5();
	}
} 

/*
 * 15. For The real time example on default method, consider the object SIM
 * 								Airtel			BSNL		Vi  	jio
 * 
 * 			SIM					
 * 
 * 			SIM2g
 * 
 * 			SIM3g
 * 
 * 			SIM4g
 * 
 * 			SIM5g
 * 
 * 16. Which Java concept forced Sun Microsystem to introduce default methods in Java 8 version?
 * 		- Collections Framework 
 */









