/*
===================================================================================
						Working with array
===================================================================================
01. What is an array?
	- An array is referenced data type, it is an object.

	- An array is a collection of variables of same type in 
	  continuation memory locations with single name

02. Why array?
	- An array is used for storing multiple values of similar type
	  in continuation memory locations as one group with single variable name

	- It is also used for passing or returning multiple values as one group 
	  to a method and from a method with single parameter and return type.

03. How can we create an array object?
	- by using data type either PDT or class name

	- for storing multiple mathematical values 
		we will create an array by using PDT

	- for storing multiple objects of a class or array,
		we will create an array by using class name or array

04. How many ways we can create an array object?
 	- We can create area object in 3 ways 
 		1. By using new keyword and dimension
 		2. By using initializer syntax with values or objects 
 		3. By using anonymous array syntax 

05, Syntax for creating an array object?
		1. DT[] arrayVarName = new DT[size];
		2. DT[] arrayVarName = {values or objects with , separator};
		3. DT[] arrayVarName = new DT[]{values or objects with , separator};

		PDT[] arrayVarName = {v1, v2, v3, ...};
		RDT[] arrayVarName = {o1, o2, o3, ...};
		
06. Syntax for reading array values? 
       arrayVariableName[index]
    
	Reading and printing array values
		System.out.println(ia[0]);                          
		System.out.println(ia[1]);
		
		System.out.println(ea[0].x);
		System.out.println(ea[1].x);

07.	Syntax for storing or modifying values in array locations?
   	   arrayVariableName[index] = value;
	   
		ia1[0] = 3;     ea[0] = new Example();	
		ia1[1] = 4;  	ea[1] = new Example();

08. Rule in accessing array location?
     index must be '>=0 && must be <length', else 
	 we will get exception java.lang.ArrayIndexOutOfBoundsException
     	int[] ia1 = {3, 4, 5, 6, 7};
     	sopln(ia1[-1]); //no CE, RE: AIOOBE
     	sopln(ia1[5]);  //no CE, RE: AIOOBE

09. Below program shows creating int[] object, 
    storing, reading and printing multiple integers 
    as one group with single variable name

*/

import java.util.Arrays;

public class Test02_ArrayCreationStoringReadingValues {
	public static void main(String[] args) {
				  //0  1  2  3  4	
		int[] ia = {3, 4, 5, 6, 7};

		System.out.println("ia   : "+ ia); 
		System.out.println();
		
//Approach #1: Reading and printing directly	//Problem: This code is 
		System.out.println("ia[0]: "+ ia[0]);	//static nature code because
		System.out.println("ia[1]: "+ ia[1]);	//as and when the number of
		System.out.println("ia[2]: "+ ia[2]);	//values in array object are 
		System.out.println("ia[3]: "+ ia[3]);	//increased or decreased
		System.out.println("ia[4]: "+ ia[4]);	//we must add and remove	
		System.out.println();					//these printing statements
		
//		System.out.println("ia[5]: "+ ia[5]); //RE: j.l.AIOOBE
		
 //Solution: we must develop dynamic code by using for loop

//Approach #2: Reading and printing	by using loop with index	

		for(int i=0; i<ia.length; i++){				
			System.out.println("ia["+i+"]: "+ ia[i]); 
		}
		System.out.println();
	
//Approach #3: Reading and printing by using for-each loop or enhanced for loop(Java 5v new feature)	

		for(int value : ia){					
			System.out.println(value); 
		}
		System.out.println();
				
//Approach #4: Directly printing by using predefined method Arrays.toString(-)
		System.out.println(java.util.Arrays.toString(ia)); //[3, 4, 5, 6, 7]

//Approach #5: by using stream API by using lambda expression
		Arrays.stream(ia).forEach(value -> System.out.println(value));
		System.out.println();
		
	//by using stream API by using method reference
		Arrays.stream(ia).forEach(System.out::println);
		
		/*
10. Limitation of an array object	
    - It can store only same or similar type values
	- If we try to store different type values, we will get CE
	  
	- For example  			

	int[] ia2 = {5, 6, 7};		//same type of values
	
	int[] ia3 = {5, 'a', 7};	//similar type of values
								//means same type or its lesser type values
								
	//int[] ia4 = {5, 7L, 10.5, true}; //incompatible types and higer range 
							//values are not allowed to store, we will get CE
	
	//solution: we must user defined class object or collection object
	  
	 */
	}
}

		
