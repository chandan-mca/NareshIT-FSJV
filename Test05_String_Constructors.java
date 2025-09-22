/*
 * String class have 15 constructors 
 * among them 8 constructors important
 * 	1. public String()
 * 	2. public String(String s) 
 * 	3. public String(StringBuffer sb) 
 * 	4. public String(StringBuilder sb) 
 * 	5. public String(char[] ca) 
 * 	6. public String(byte[] ba) 
 * 	7. public String(char[] ca, int offset, int count) 
 * 	8. public String(byte[] ba, int offset, int count) 
 */
public class Test05_String_Constructors {
	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println("s1: "+ s1);
		
		String s2 = new String("Hari");
		System.out.println("s2: "+ s2);
		
		StringBuffer sb1 = new StringBuffer("NiT");
		String s3 = new String(sb1);
		System.out.println("s3: "+ s3);
	
		StringBuilder sb2 = new StringBuilder("Ameerpet");
		String s4 = new String(sb2);
		System.out.println("s4: "+ s4);
					//0    1    2    3    4    5
		char[] ca = {'a', 'b', 'c', 'd', 'e', 'f'};
		String s5 = new String(ca);
		System.out.println("s5: "+ s5);
		
		String s6 = new String(ca, 2, 3);
		System.out.println("s6: "+ s6);
		
		byte[] ba = {97, 98, 99, 100, 101, 102};
		String s7 = new String(ba);
		System.out.println("s7: "+ s7);

		String s8 = new String(ba, 2, 3);
		System.out.println("s8: "+ s8);
		
		/**/
	}
}
