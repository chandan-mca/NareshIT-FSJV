/*
 * When must we create a variable?
 * 	- when we provide a name to a value or to an object 
 * 	- when we need to reuse a variable or an object
 *    then only we must create variable.
 *  
 *  - we must not create variable just for fun
 *    it leads performance issue, because it takes 
 *    more memory and time.
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		
		
		int i1 = 5;
		System.out.println(i1);
		
		System.out.println(5);
	//==========================================	

		String s1 = "HK";
		System.out.println(s1);
		
		System.out.println("HK");
	//==========================================
		Example e1 = new Example();
		System.out.println(e1.x);
		System.out.println(e1.y);
		
		System.out.println(new Example().x);
		System.out.println(new Example().x);
		
	}
}
