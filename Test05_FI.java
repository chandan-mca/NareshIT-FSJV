/**
Functional interface
====================
Q1. What is a functional interface? 
	- An interface that has only one abstract method
	 is called functional interface  
	 
   - A functional interface is also called as SAM 
	 Single Abstract Method (SAM) interface.
	 
Q2. Why functional interface?       
   - It is used 
		1. for enabling functional programming in Java
		2. for providing target types 
		3. for implementing and storing Lambda Expressions
	 
Q3. How can we create FI?
	- by using the keyword interface
	  but this interface should contain 
	  only 'one abstrat method', PLUS it can have 
	  multiple DMs, SMs and private methods  	
  
Q4. Identify FIs in the below list   
 */

		interface I6 {								//FI
			void m1();
		}
		
		interface I7 {								//not FI
			void m1();
			void m2();
		}
		
		interface I8 {								//FI					
			void m1();
			
			default void m2() { }
			default void m3() { }
			
			static void m4() { }
			static void m5() { }
			
			private static void m6() { }
			private static void m7() { }
		}
		
/*
Q5. How can we guarantee an interface is a FI?
	Declare this interface by using @FunctionalInterface annotation

Q6) What is a @FunctionalInterface annotation?
	- it is marker annotation

Q7) Why @FunctionalInterface annotation?
	- to mark an interface is a functional interface

Q8) Rule on @FunctionalInterface?
	- If we apply @FunctionalInterface annotation to an interface
	 it must have only one abstract method and 
	 can have multiple DMs, SMs, PMs	

 */
		interface I9 {			//compiled but not a FI
			void m1();
			void m2();  
		}

		//@FunctionalInterface    //not compiled because not a FI
		interface I10{			
			void m1();
			void m2();  
		}
		
		@FunctionalInterface    //no CE, because it is a FI
		interface I101{			
			void m1();
		}

		@FunctionalInterface
		interface I102 {								//FI					
			void m1();
			
			default void m2() { }
			default void m3() { }
			
			static void m4() { }
			static void m5() { }
			
			private static void m6() { }
			private static void m7() { }
			
		}

		/*
 * How many ways we can implement a function interface?
 * 1. Outer class				Java 1.0v
 * 2. Anonymous inner class		Java 1.1v
 * 3. Lambda expression			Java 8v
 * 4. Method reference			Java 8v
 */

@FunctionalInterface
interface I111 {  		//1. no-input and no-output
	void m1();
}

//I11.java
class I11Impl implements I111 {
	@Override
	public void m1() {
		System.out.println("I11: OC implimenation");
	}
}

//Test05_FI.java
public class Test05_FI {
	public static void main(String[] args) {
		
	//Approach #1: OC	
		I111 i1 = new I11Impl();
		i1.m1();
		
	//Approach #2: AIC
		I111 i2 = new I111() {
					@Override
					public void m1() {
						System.out.println("I11: AIC implimenation");
					}
				};
		i2.m1();
		System.out.println(i2);
		
	//Approach #3: LE (anonymous function short-cut of LE)
		I111 i3 = () -> System.out.println("I11: LE implimenation");
		i3.m1();
	
	}
}

/*
Q9. How can we implement multiple functionalities with FI?
		1. Multiple functional interfaces
		   		different functions different FIs
		   
		2. Generic functional interface 
		   		Same function with different type of parameters
*/
@FunctionalInterface
interface I112 {				//FI with same functionality 
	void ao(int a, int b);		//with diff parameters
	//void ao(float a, float b);
	//void ao(char a, char b);
	//void ao(long a, long b);
}	

@FunctionalInterface				//Option #1: multiple FIs
interface I113 {						//wrong design, static code
	void ao(float a, float b);		//number of FIs are increased
}	

@FunctionalInterface
interface I114 {
	void ao(char a, char b);
}	

@FunctionalInterface
interface I115 {
	void ao(long a, long b);
}	


@FunctionalInterface		//Solution: generic FI
interface AO2<T> {			//with single AM with generic parameters
	void ao(T a, T b);
}	


class Test{
	public static void main(String[] args) {
		AO2<Integer> a1 = (Integer i1, Integer i2) -> {System.out.println(i1 + i2);};		
		AO2<Float>	a2 = (Float i1, Float i2) -> {System.out.println(i1 + i2);};		
		AO2<String>	a3 = (String i1, String i2) -> {System.out.println(i1 + i2);};		
		
		a1.ao(10, 2);
		a2.ao(10.5F, 2.4F);
		a3.ao("H", "K");
	}
}

//Different combination of FIs

	@FunctionalInterface
	interface I121<T> {		//1. only input and no-output
		void m1(T t);			//1. Consumer<T> 
	}
	
	@FunctionalInterface
	interface I131<T> {		//2. no input, only output
		T m1();					//2. Supplier<T>
	}
	
	@FunctionalInterface
	interface I141<T, R> {	//3. input and output
		R m1(T i);				//3. Function<T, R>
	}
	
	@FunctionalInterface
	interface I151<T> {		//4. input and boolean type output	
		boolean m1(T i);		//4. Predicate<T>
	}









