/**
Functional programming
======================
1. It is a one programming paradigm.

2. By using the functional programming, 
	1. we can store a function or logic directly in a variable or 
	2. we can pass it as an argument to a method parameter or 
	3. we can return it as a method return value directly
	without creating extra class, method and object.
   
3. In the OOP, if we want to pass logic as an argument to a method 
   it is not possible to pass logic directly. 
   
   We must create a class, a method then an object 
   then further we can pass this object as argument to a method for executing this logic 
   which is an excess code as shown below

		class Addition {
			void add(int a, int b) {
				int c = a + b;
				System.out.println(c);
			}
		}

		class Substraction {
			void sub(int a, int b) {
				int c = a - b;
				System.out.println(c);
			}
		}
		
		class Multiplication {
			void mul(int a, int b) {
				int c = a * b;
				System.out.println(c);
			}
		}

		class Division {
			void div(int a, int b) {
				int c = a / b;
				System.out.println(c);
			}
		}

		class Test04_FP {
			public static void main(String[] args) {
				
				Addition		a1 = new Addition();
				Subtraction		s1 = new Subtraction();
				Multiplication	m1 = new Multiplication();
				Division		d1 = new Division();
				
				a1.add(10, 20);
				s1.sub(10, 20);
				m1.mul(10, 20);
				d1.div(10, 20);
				
				Calc.calculate(new Addition());
			}
		}

		class Calc {
			static void calculate(Addition a) {
				a.add(50, 60);	
			}
			static void calculate(Subtraction s) {
				s.sub(50, 60);	
			}
			static void calculate(Multiplication m) {
				m.mul(50, 60);	
			}
			static void calculate(Division d) {
				d.div(50, 60);	
			}
		}

4. In functional programming 
	1. we can pass a function or a logic directly as argument
       without creating a class, a method and an object explicitly. 

	2. we can avoid creating multiple classes, 
	   multiple overloaded methods to perform similar kind of 
	   mathematical operations such as addition, subtraction, 
	   multiplication and division.   
	   
5. The building blocks of functional programming are	
		1. Functional interface 
		2. Lambda expression 
		
	- Functional interface is meant for declaring
	  a function for representing mathematical operation 
	  
	- The Lambda expression is used for implementing 
	  this functional interface method and passing it directly 
	  as an argument to a method without creating an explicit class 
	  and object   

	- Hence with the functional programming 
	  by using the functional interface and Lambda expression 
	  the programming becomes simple, short and direct as shown below
 */
class Addition {
	void add(int a, int b) {
		System.out.println(a+b);
	}
}

class Subtraction {
	void sub(int a, int b) {
		System.out.println(a-b);
	}
}

class Multiplication {
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}

class Division {
	void div(int a, int b) {
		System.out.println(a/b);
	}
}

class Calc {
	void calculate(Addition a) {
		a.add(50, 60);
	}
	void calculate(Subtraction s) {
		s.sub(50, 60);
	}
	void calculate(Multiplication m) {
		m.mul(50, 60);
	}
	void calculate(Division d) {
		d.div(50, 60);
	}
}

public class Test04_FP {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		Addition a1 = new Addition();
		a1.add(10, 20); calc.calculate(a1);

		Subtraction s1 = new Subtraction();
		s1.sub(10, 20); calc.calculate(s1);
		
		Multiplication m1 = new Multiplication();
		m1.mul(10, 20); calc.calculate(m1);
		
		Division d1 = new Division();
		d1.div(10, 20); calc.calculate(d1);
		System.out.println();
	
	//============ Functional Programming style ============================================	
					//Lambda Expression
		AO ao1 = (a, b) -> { System.out.println(a+b);};		//logic creation and storing
		AO ao2 = (a, b) -> { System.out.println(a-b);};
		AO ao3 = (a, b) -> { System.out.println(a*b);};
		AO ao4 = (a, b) -> { System.out.println(a/b);};
		
		ao1.ao(12, 13);		//calling and executing logic
		ao2.ao(12, 13);	
		ao3.ao(12, 13);	
		ao4.ao(12, 13);	
		
		Calculator cal = new Calculator();
		cal.calculate(ao1);
		cal.calculate(ao2);
		cal.calculate(ao3);		//passing logic as argument
		cal.calculate(ao4);
	}
}
class Calculator {
	void calculate(AO ao) {
		ao.ao(15, 16);
	}
}

@FunctionalInterface
interface AO {
	void ao(int a, int b);
}

