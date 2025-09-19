/**
 * Java 9v private methods
 * ========================
 * 1. From Java 9 version onwards inside an interface 
 *    we can also create private static and non-static methods
 *    
 * 2. The private static method is used for providing reusable logic common to 
 *    all static implemented methods defined in this interface
 *         
 * 3. The private non-static method is used for providing reusable logic common to 
 *    all default implemented methods defined in this interface
 *    
 * 4. Basically a private method is used for accessing logic within the same class or 
 *    same interface other methods         
 *    
 * 5. Below program explains the need of private static and private non-static method 
 *    inside an interface 
 *    
 */
interface I5 {
	private static void m1() {
		System.out.print("Hi ");
	}
	
	private void m2() {
		System.out.print("Hello ");
	}
	
	public static void m3() {
		m1();
		System.out.println("m3");
	}
	
	public static void m4() {
		m1();
		System.out.println("m4");
	}
	
	public static void m5() {
		m1();
		System.out.println("m5");
	}

	public default void m6() {
		m2();
		System.out.println("m6");
	}
	
	public default void m7() {
		m2();
		System.out.println("m7");
	}
	
	public default void m8() {
		m2();
		System.out.println("m8");
	}
	
}
class C8 implements I5 {
	void call() {
		//m1();
		//m2();
		
		I5.m3();
		I5.m4();
		I5.m5();
		
		m6();
		m7();
		m8();
	}
}

public class Test03_Java9v_PM {
	public static void main(String[] args) {
		new C8().call();
	}
}
