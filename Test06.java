/*
 * Where are we allowed to create a variable?
 * 	1. only inside a class and
 * 	2. inside a method
 * 
 * we can not declare a variable at file level directly
 * it leads to CE: class or interface or enum or record expected
 */

//Scope #1: Java file level (not allowed)

	//int a = 10; CE:

public class Test06 {
	//Scope #2: class level  (allowed)
	int a = 10;
	
	public static void main(String[] args) {
		//Scope #3: method level (allowed)
		int a = 10;
		
	}
}
