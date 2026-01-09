/**
 * To perform this conversion in all WCs we have 
 * static method parameterized toString() with PDT as parameter
 * 
 * 		public static String toString(PDT value)
 * 
 * also we have a static overloaded method in String class
 * 		public static String valueOf(PDT value) 
 *  
 */
public class Test06_PVtoPSO {
	public static void main(String[] args) {
		//50 -> "50"
		
		int i1 = 50;						//int 50
		
		//String s1 = (String)il;
		//String s1 = new String(il);
		String s1 = Integer.toString(i1);	//"50"
		String s2 = String.valueOf(i1);		//"50"
		
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
