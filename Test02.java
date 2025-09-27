/*
Constructor and types of constructors
======================================================
 - A constructor is a kind of method whose name is 
   same as class name and does not have return type

 - It is used for initializing an object's NSVs 
   with the given values at the time of object creation.

 - In Java, object is created by new operator
   and it is initialized by constructor

 - In Java, the constructor is not a constructor
   it is an initalizer, means constructor does not 
   create/construct object memory, it is done by new keyword.

 - The syntax for creating a constructor is
	
	Method syntax:
		AM  ELM  RT  MN(PL) throws EL {
                ----
                ----	logic 
                ----      - blogic( vals, cals, generate result)
                ----      - setting logic
                ----      - getting logic
                ----      - printing logic
                ----      
		}

	Constructor syntax:

		<AM> <ClassName>(Parameters) throws Exception-List {
				---
				---  Initialization logic
				---		vals, cals, storing result in this object fields
				---
		}
	
- The syntax for calling constructor
    - By default the constructor is not executed by JVM automatically 
	  we must call it explicity by using new keyword.
	  	
		new <classname>(args);

	Note: In constructor definition 
			1. AM, Parameters and throws exception and logic are optional
			2. ClassName () and { } are mandatory
			
		 In calling a constructor
		 	1. args are depending on the constructor parameters
			   if constructor does not have parameters we must not pass arguments
			   if consturcotr has parameters we must pass arugments

- Below program shows creating constructor, calling and executing it

*/
class Example {
	
	Example() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");

		new Example();
	}
}
