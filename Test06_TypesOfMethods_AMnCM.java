/*
13. Types of methods
	1. Basically Java supports two types of methods 
		1. Abstract method 
		2. Concrete method  
		
	- A method that is created without body 
	  and ends with a semicolon is called abstract method.
	  
	  - The abstract method must be declared as abstract and 
	    must be placed only inside either abstract class or 
		inside interface. 
		
	  - It is used for declaring an operation to force 
	    sub type programmers to implement those operations
			
			- For example, PM forces CMs to Lockdown India
			  by using an abstract method 
					public abstract void lockDown();'	//declared by PM(super class)
			 
			- Then all states CMs will lockDown the states
			  by implementing abstract method
					public void lockDown(){ } //implemented by CMs(sub classes)
			
			- For more details on abstract method 
			  refer 'Abstraction' chapter 

	- A method that is created with body is called concrete method 
		- In a concrete method creation 
		  we must not use the keyword 'abstract' 
		  
		- A concrete method is used for implementing an operation 
		  for reusing by sub class programmers or by any other 
		  programmers in the project   
		  
		- For example: 
		     - PM relases funds to state CMs to spend on state development  
			   with a concrete method 
				  public void releaseFunds(){ ---- logic } //defining method
				
			 - State CMs or the contractor calls above method to get funds
			     releaseFunds();		//calling and reusing method	

- Below program explains declaring, implementing, defining and calling 
  abstract and concrete methods
*/
abstract class Example {  //super class
	//1. abstract method
	abstract void m1();	//AM -> declaring and forcing sub classes to [implement]
	
	//2. concrete method
	void m2() {			//CM -> defining and allowing to [reuse or override]
		System.out.println("CM m2() method is executed from super class Example");
	}
}

class Sample extends Example { //creating sub class
	
	void m1() {	//implementing Example class's AM in sub class Sample (Mandatory)
		System.out.println("AM m1() is executed from sub class Sample");
	}
	
	void m2() { //overriding super class method in sub class (optional)
		System.out.println("CM m2() is executed from sub class Sample");
	}
}

class Test06_TypesOfMethods{

	public static void main(String[] args) {
		System.out.println("main start");
			//Example e1 = new Example(); //creating super class object
						//CE: Example is abstract; cannot be instantiated
						
			Sample s1 = new Sample();	//creating sub class object
			
			s1.m1();	//rusign super class AM from sub class
			
			s1.m2();	//reusing super class CM
							//it may be executed from 
							//sub class Sample or 
							//super class Example if not overridden	
			
		System.out.println("main end");
	}
}
