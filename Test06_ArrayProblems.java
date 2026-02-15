import java.util.ArrayList;

/**
 * 
 * 1. Array can not store different type of values
 * 2. Array is a fixed size memory object
 * 3.
 * 4.
 * 5.
 * 
 */
public class Test06_ArrayProblems {
	public static void main(String[] args) {
		
		int[] ia = new int[5];
		ia[0] = 10;
//		ia[1] = 10L;
//		ia[2] = 10.5;
//		ia[3] = true;
//		ia[4] = "a";
		
		double[] da = new double[5];
		da[0] = 10;
		da[1] = 'a';
		da[2] = 10L;
		da[3] = 10.5;
//		da[4] = true;
//		da[4] = "a";
	//=======================================
		
		Student[] sa = new Student[5];
		sa[0] = new Student();
		sa[1] = new Student();
//		sa[2] = new Faculty();
//		sa[2] = new Admin();
//		sa[2] = new Person();
		
		Person[] pa = new Person[5];
		pa[0] = new Person();
		pa[0] = new Student();
		pa[0] = new Faculty();
		pa[0] = new Admin();
//		pa[0] = new Tiger();
//		pa[0] = new Lion();
		
		Animal[] aa = new Animal[5];
//		aa[0] = new Animal();
		aa[0] = new Lion();
		aa[0] = new Tiger();
		aa[0] = new Rabbit();
//		aa[0] = new Student();
		
	//=========== Solution to Array type problem ========
		
		Object[] oa = new Object[5];
		oa[0] = 5;
		oa[0] = 5L;
		oa[0] = 5.0;
		oa[0] = 'a';
		oa[0] = true;
		oa[0] = "abc";
		oa[0] = new Student();
		oa[0] = new Tiger();
		
	//===============Problem #2: fixed in size ====================================	
		
		Object[] oa2 = new Object[3];
		oa2[0] = new Student();
		oa2[1] = new Faculty();
		oa2[2] = new Admin();
	//	oa2[3] = new Lion();  //RE: AIOOBE
		
		//=========Problem #2: solution is collection [growable array]============================
		ArrayList<Object> al = new ArrayList<Object>(3);
		al.add(new Student());
		al.add(new Faculty());
		al.add(new Admin());
		
		al.add(new Lion());  //growing collection capaicty then object is stored
		System.out.println(al);
		
		
	}//main close
	
	static class Person{ } 
	static class Student extends Person{ } 
	static class Faculty extends Person{ } 
	static class Admin extends Person{ }
	
	static interface Animal { }
	static class Lion implements Animal { }
	static class Tiger implements Animal { }
	static class Rabbit implements Animal { }
}
