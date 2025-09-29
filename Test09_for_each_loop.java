import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * - The for each loop is a Java 5v new feature
 * 
 * - It is an alternative to Iterator for 
 *   retrieving objects from both 
 *   List and Set collections with less code
 *   
 *  - It is just a for loop with enhanced syntax
 *  
 *  - It contains only two expressions with : as separator
 *      1. exp1 is 'variable declaration' (no assignment)
 *      2. exp2 is 'array or Collection or Iterable' interface implemented class object
 *      
 *  - Syntax with four rules:
 *  	for(var dec : array/Collection/Iterable object){
 *          -- blogic
 *      }
 *      
 *  - For each loop internal rewrite as Iterable code by Compiler
 *  - Hence JVM does not know about for-each loop
 *  - It is just a communication between Developer and Compiler
 *      
 */ 
public class Test09_for_each_loop {
	public static void main(String[] args) {
	
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
	//== Java 1.4 style code with Iterator ==
		Iterator<Object> itr = al.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);	//blogic
		}
		System.out.println();
		
	//== Java 5v code -> Enhanced for-each or for-each loop	==
		for(Object obj : al) {
			System.out.println(obj); 	//blogic
		}
		System.out.println();
		
//===================For each loop on Set ============================================================		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		
		for(Object obj : lhs) {
			System.out.println(obj);
		}
		
		
//======for each loop rules==================================================================
	//Rule #1: the object must be only either array or Collection or Iterable type

		String s1 = "hari";
//		for(char ch : s1) { } //CE: String does not implement Iterable interface
			
		LinkedHashMap<Object, Integer> lhm = new LinkedHashMap<Object, Integer>();
//		for(Object obj : lhm) {	} //CE: Map does not implement Iterable interface
		
		Iterator<Object> itr2 = al.iterator();
//		for(Object obj: itr2) { } //CE: Iterator does not extend Iterable interface
		
		int[] ia = {4, 5};
		for(int i: ia) { }
		
		String[] sa = {"a", "b"};
		for(String s: sa) { }
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		for(Object obj : al1) {}
	
	//Rule #2: The variable type must be of the source object generic type or its widening type
		ArrayList<Object> al2 = new ArrayList<Object>();
		for(Object obj : al2) {}
//		for(String s : al2) {}
		
		ArrayList<String> al3 = new ArrayList<>();
		for(Object obj: al3) {}
		for(String s: al3) {}
//		for(Integer i: al3) {}
		
		int[] ia2 = {};
		for(int i: ia2) {}
//		for(byte i: ia2) {}
//		for(char i: ia2) {}
		for(long i: ia2) {}
		for(float i: ia2) {}
		
	//Rule #3: we must declare variable in for () only
		//like in regular for loop, we can not declare variable before for() and 
		//can not be used in for()
		
		int i;
//		for(i:ia2) { } //the variable i must be declared in () only
		for(int i2 : ia2) { } //allowed

	//Rule #4: the for() loop variable can not be used after for() { } body,
	//			it is just a local variable it can be used in for(){ } only
		
		for(int i3: ia2) { }
//		System.out.println(i3); //CE: can not find symbol variable i3
		
		//we can recreate for loop variable after for() { }
		int i3 = 5; //allowed
		
		for(int i4:ia2) { }
		for(int i4:ia2) { } //allowed
	/**/	
	}
		
}
