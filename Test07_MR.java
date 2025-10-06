/*
Method reference 
================
1. What is a method reference?
	- Referencing or calling a method or constructor of one class
	  for implementing a FI is called method reference

  	- A method reference is a short-cut for creating LE

2. Why method reference?
	- it is for decreasing code in create LE
	- LE is itself short-cut for implementing FI
	- MR is more short for LE for implementing FI

3. How can we implement MR?
	- A method refernce is implemented 
	  by using a separator called '::' (double colon)
	 
	- In java :: is not a operator
	  it is a separator 	 

4. How many ways we can implemnent MR?
	In 3 ways 
		1. static method reference  
		2. instance method reference  
		3. constructor reference

	- if we access a static method of a class for implementing FI
	  it is called static method reference

	 - Syntax and example:
			FI fi = ClassName::staticmethodname;
			I1 i1 = A1::m1;

	- if we access a non-static method of a class for implementing FI
	  it is called non-static method reference or instance method reference

	- Syntax and example:
			FI fi = ClassObject::instancemethodname;
			I1 i1 = new A1()::m1;

	- if we access a constructor of a class for implementing FI
	  it is called constructor reference

	- Syntax and example:
			FI fi = ClassName::new;
			I1 i1 = A1::new;

5. If the referenced method or constructor 
	is a overloaded method or constructor, which 
	parameter method or constructor is executed?
		- it is depending on FI method parameters 


 */

class A1 {
	static void m1() {
		System.out.println("A1 m1() Hi");
	}
	
	static void m1(int a) {
		System.out.println("A1 m2(int) "+ a);
	}
	
	void m2() {
		System.out.println("A1 m2()");
	}

	void m2(int a) {
		System.out.println("A1 m2(int) a: "+ a);
	}
	
	A1(){
		System.out.println("A1 NPC");
	}
	
	A1(int a){
		System.out.println("A1 IPC a: "+ a);
	}
	
}

@FunctionalInterface
interface Abc1 {
	void abc();
}

@FunctionalInterface
interface Abc2 {
	void abc(int a);
}

public class Test07_MR {
	public static void main(String[] args) {
		
		Abc1 a1 = () -> { System.out.println("LE Hi"); };
		a1.abc();
		
	//======================================================================	
		Abc1 a2 = () -> { A1.m1(); };
		a2.abc();
		
		Abc1 a3 = A1::m1; 	//method reference is short-cut LE creation
		a3.abc();
	//======================================================================	
		
		Abc2 a4 = a -> A1.m1(a);
		a4.abc(10);
		
		Abc2 a5 = A1::m1;
		a5.abc(20);
		System.out.println();
	//======================================================================	
		
		Abc1 a6 = () -> new A1().m2();
		a6.abc();
		
		Abc1 a7 = new A1()::m2;
		a7.abc();
		
	//======================================================================	
	
		Abc2 a8 = a -> new A1().m2(a);
		a8.abc(123);
		
		Abc2 a9 = new A1()::m2;
		a9.abc(223);
		System.out.println();
		
	//======================================================================
		
		Abc1 a10 = () -> { new A1(); };
		a10.abc();
		
		Abc2 a11 = (int a) -> { new A1(a); };
		a11.abc(5656);
		System.out.println();
		
	//======================================================================
		Abc1 a12 =  A1::new;
		a12.abc();
		
		Abc2 a13 = A1::new;
		a13.abc(2345);
		System.out.println();
	//=====================================================================
		Abc2 a14 = (a) -> { System.out.println(a); };
		a14.abc(45);
	
		Abc2 a15 = System.out::println; 
		a15.abc(55);

/**/		
	}
}
