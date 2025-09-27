/*
Constructor and types of constructors
=====================================
- Unknowingly in every program we have been calling a constructor
  that is default consturctor
  
- In an object creation, after new keyword we place classname();
  it is constructor call

- In every class compiler places a constructor by default
  this constructor is technically called as default constructor

- To check this constructor we must read the class byte code in .class 
  by using the command 'javap'

- To use javap we must set path variable as shown below

	1. Open command prompt
	2. Change drive and directory to the folder in which you have saved this java file
	3. run below command 
		set path=C:\jdk-21\bin
		javac Test01.java
		javap Example

- The javap command shows the compiler generated code as below
	//Example.class
	class Example {
		Example()	<= It is the default constructor added by compiler
		public static void main(String[] args)
	}

*/
class Example {

	private int x;
	private int y;

	public static void main(String[] args) {
		
		Example e1 = new Example();  
						//default constructor call
	
		//m1(); CE: can not find symbol method m1

	}
}
