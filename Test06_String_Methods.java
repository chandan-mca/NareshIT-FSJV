/*
 * String methods to perform operations
 */

import java.util.Arrays;

public class Test06_String_Methods {
	public static void main(String[] args) {
		
	/*
	 * 
	 * 1. public boolean isEmpty()	
	 * 			-> returns true if string is empty(no characters)
	 * 
	 * 2. public boolean isBlank()	
	 * 			-> returns true if string is empty or spaces string
	 * 
	 * 3. public int length()		
	 * 		-> returns length of the string(number of characters)
	 * 
	 * 		Note: if string has only null character '\0', 
	 *            it is not considered as empty string or blank string
	 *            its length is 1 character
	 */
		
		String s1 = "";
		String s2 = " ";
		String s3 = "\0";
		String s4 = "abc";
		
		System.out.println(s1.isEmpty() + "\t" + s1.isBlank() + "\t" + s1.length());
		System.out.println(s2.isEmpty() + "\t" + s2.isBlank() + "\t" + s2.length());
		System.out.println(s3.isEmpty() + "\t" + s3.isBlank() + "\t" + s3.length());
		System.out.println(s4.isEmpty() + "\t" + s4.isBlank() + "\t" + s4.length());
		System.out.println();
		
	/*
	 * 4. public String toString()			
	 * 		-> overridden to print String object state
	 */
		System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);
		System.out.println();
		
	/*
	 * 5. public int    hashCode()			
	 * 		-> overridden to return hash code based on the state 
	 * 				(ch[0]*31^len-1+ch[1]*31^len-2 + ch[2]*31^len-3...)
	 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println();
	/*	
	 * 	  == operation
	 * 		-> compares two String objects by using their reference
	 * 
	 * 6. public boolean equals(Object obj)	
	 * 		-> overridden to compare two String objects with state with case
	 * 
	 * 7. public boolean equalsIgnoreCase(String s)	
	 * 		-> for comparing String objects with state without case
	 */	
		String s5 = "abc";
		String s6 = "abc";
		String s7 = new String("abc");
		
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		System.out.println(s5 == s7);
		System.out.println(s5.equals(s7));
		
		String s8 = "Abc";
		System.out.println(s5 == s8);
		System.out.println(s5.equals(s8));
		System.out.println(s5.equalsIgnoreCase(s8));
		System.out.println();
	
	/* 
	 * 8. public int compareTo(String s) 
	 * 		-> compare String objects with state and returns their difference.
	 * 		   The result will either -ve num or +ve num or zero 	  
	 *         This method belongs to Comparable interface
	 * 
	 * 9. public int compareToIgnoreCase(String s) 
	 *       -> to compare String objects with state without case 
	 * 			and returns their difference. 
	 *          This method belongs String class but not Comparable interface
	 */ 

		s1 = "a";
		s2 = "a";
		s3 = "b";
		s4 = "A";
		System.out.println(s1.compareTo(s2)); //97-97 -> 0 
		System.out.println(s1.compareTo(s3)); //97-98 -> -1
		System.out.println(s1.compareTo(s4)); //97-65 -> 32
		System.out.println(s1.compareToIgnoreCase(s4)); //97-97 -> 0
		System.out.println();
		
		s1 = "abc";
		s2 = "bbc";
		s3 = "adc";
		s4 = "abc";
		s5 = "abcdef";
		s6 = "adcdef";
		
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s5.compareTo(s1));
		System.out.println(s1.compareTo(s6));
		System.out.println();
		
		
	/* 10. public boolean contentEquals(StringBuffer sb) 
	 * 11. public boolean contentEquals(CharSequence cs)
	 */	
		s1 = "abc";
		s2 = "abc";
		s3 = "Abc";
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		
//		System.out.println(s1 == sb1); 				//CE: i c t
		System.out.println(s1.equals(sb1)); 		//false (type different)
		System.out.println(s1.equals(sb1.toString()));//true(same type and state)
		System.out.println(s1.contentEquals(sb1)); 	//true	(same state)
		System.out.println(s1.contentEquals(sb2)); 	//true	(same state)
		System.out.println(s1.contentEquals(s2)); 	//true	(same state)
		System.out.println(s1.contentEquals(s3)); 	//false	(diff case)
//		System.out.println(s1.contentEqualsIgnoreCase(s3)); //CE
		System.out.println(s1.contentEquals(s3.toLowerCase())); //true
		System.out.println();
		
	/*
	 *  12. public boolean contains(CharSequence s)
	 *  13. public boolean startsWith(String s)
	 *  14. public boolean endsWith(String s)
	 */
		s1 = "Java Programming Langauge";
		System.out.println(s1.equals("Program"));
		System.out.println(s1.contains("Program"));
		System.out.println(s1.startsWith("Program"));
		System.out.println(s1.endsWith("Program"));
		System.out.println();
		
		System.out.println(s1.equals("Java"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("Java"));
		System.out.println();
		
		System.out.println(s1.equals("J"));
		System.out.println(s1.contains("J"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.endsWith("J"));
	
	/*
	 * 15. public int indexOf(char ch)	
	 * 16. public int indexOf(String s)	
	 * 17. public int indexOf(char ch, int fromIndex)
	 * 18. public int indexOf(String s, int fromIndex)
	 * 	
	 * 19. public int lastIndexOf(char ch)	
	 * 20. public int lastIndexOf(String s)	
	 * 21. public int lastIndexOf(char ch, int fromIndex)
	 * 22. public int lastIndexOf(String s, int fromIndex)
	 * 	
	 */
		
		s1 = "Java Programming Language";
		System.out.println(s1.contains("Program")); //true
		System.out.println(s1.contains("program")); //false
		
		System.out.println(s1.indexOf("Program")); //5
		System.out.println(s1.indexOf("program")); //-1

		System.out.println(s1.indexOf('a')); //1
		System.out.println(s1.lastIndexOf('a')); //22
		System.out.println(s1.indexOf('a', 5)); //10
		System.out.println(s1.lastIndexOf('a', 20)); //18
		System.out.println();
		
	/*
	 * 23. public char   charAt(int index)	
	 * 24. public String substring(int beginindex)
	 * 25. public String substring(int beginindex, int endindex)
	 * 26. public String subSequence(int beginindex, int endindex)
	 * 
	 * 		Rule: index>=0 && index<length
	 * 			beginIndex character is inclusive
	 * 			endIndex   character is exclusive
	 * 
	 */
		
		s1 = "Java Programming Language";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(12));
		System.out.println(s1.charAt(20));
		//System.out.println(s1.charAt(25));
		//System.out.println(s1.charAt(-1));
		
		System.out.println(s1.substring(5));		//Programming Language
		System.out.println(s1.substring(5, 11));	//Progra
		System.out.println(s1.substring(5, 12));	//Program
		
		//static way of retrieving substring
		s1 = "Java Object-Oriented multithread Programming Language";
		System.out.println(s1.substring(5, 12));	//Object-
		            
		//dynamic way of retrieving the substring 'Program' 
		//by using indexOf() and substring() methods
		int index = s1.indexOf("Program");
		int end   = index + "Program".length();
		String str = s1.substring(index, end);
		System.out.println(str);
		
	/*
	 * 	27. public String[] split(String regex)
	 */
		s1 = "Java Programming Laguage";	
		String[]  words = s1.split(" ");
		
		System.out.println(s1);
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		
		words = s1.split("a");		
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		
		words = s1.split("g");		
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();
		
		s1 = "Ja1va Program2ming Lang3uage";
		words = s1.split("123");
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();

		s1 = "Ja1va Program2ming Lang3uage";
		words = s1.split("[123]");
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();
		
		s1 = "Ja1va Program2ming Lang3uage";
		words = s1.split("[0-9]");
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();
		
	/*
	 * 28. public char[] toCharArray()	
	 * 29. public byte[] getBytes()	
	 */
	
		s1 = "abc bbc cbc";
		char[] ch = s1.toCharArray();
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		
		byte[] ba = s1.getBytes();
		System.out.println(ba);
		System.out.println(Arrays.toString(ba));
	/*
	 * 30. public static String valueOf(xxx data)	
	 * 			xxx is any Java data type 
	 *          [primitive type or array or class object]
	 */
		int i1 = 10;
//		s1 = i1;
//		s1 = (String)i1;
		s1 = String.valueOf(i1);
		s1 = String.valueOf(10);
		
		System.out.println(i1); //-> 10 as int 
		System.out.println(s1); //-> 10 as String
		System.out.println();
		
		
//============================================================================		
	/*
	 * - String is immutable, modification are not stored in the same current object
	 * 
	 * - Always string modification result is returned as new object
	 * - for storing new String object with result, we must assign
	 *   String manipulation methods a new variable of String type
	 *   else the result string is garbage collected, we cannot access result
	 *    
	 * - when we call any of the String manipulation methods,
	 *   in the current String object, at least one character is not changed, 
	 *   those methods returns the same current String object.
	 *   
	 * - Then the old variable and new variable both points to the same object. 
	 */
		
		
	/* 	
	 * + operator
	 * 31. public String concat(String s)
	 * 32. public static String join(String delimit, CharSequence... args)
	 */
		s1 = "Java ";
		System.out.println(s1);
		
		s1.concat("Hari");
		System.out.println(s1); 
		System.out.println();
		
		s2 = s1.concat("Hari");
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println();
		
		s3 = s1 + "Programming";
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();
		
		s2 = String.join(" ", "Java", "Programmming");
		System.out.println(s2);

		s2 = String.join("-", "Java", "Programmming");
		System.out.println(s2);

		s2 = String.join("", "Java", "Programmming");
		System.out.println(s2);

		s2 = String.join("", "Java", "Programmming", "Language");
		System.out.println(s2);

		s2 = String.join("#", "Java", "Programmming", "Language");
		System.out.println(s2);

		s2 = String.join("$", "Java");
		System.out.println(s2);

		s2 = String.join("$", "Java", "Knowledge");
		System.out.println(s2);
		
		s1 = String.join("$", "Java", "Knowledge");
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.concat("");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println();
		
		s2 = s1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println();
		
	/*
	 * 33. public String toLowerCase()	
	 * 34. public String toUpperCase()	
	 */
		s1 = "Java Hari";
		System.out.println(s1);
		
		s1.toLowerCase();
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s1 = "abc";
		s2 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println();
		
		s1 = "1@2";
		s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println();
		
	/*
	 * 35. public String replace(char oldChar, char newChar)	
	 * 36. public String replace(CharSequence oldString, CharSequence newString)	
	 * 37. public String replaceAll(String regex, String newString)	
	 * 38. public String replaceFirst(String regex, String newString)	
	 */
		s1 = "Java Programming Language, secured Programming Language";
		System.out.println(s1);
		
		s1.replace('a', 'y');
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.replace('a', 'y');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s2 = s1.replace("Programming", "z");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s2 = s1.replaceAll("Programming", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s2 = s1.replaceAll("[Programming]", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();

		s2 = s1.replaceFirst("a", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s2 = s1.replaceFirst("Programming", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s2 = s1.replaceFirst("[Programming]", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s1 = "Programming Java Language, secured Programming Language";
		s2 = s1.replaceFirst("[Programming]", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
	/* 
	 * 39. public String trim()
	 * 
	 * 40. public String strip()
	 * 41. public String stripLeading()
	 * 42. public String stripTrailing()
	 * 
	 */
		s1 = "  abc bbc   ";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println();
		
		s1.trim();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println();
		
		s2 = s1.trim();
		System.out.println(s1 + "-"+ s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println();
		
		s1 = s1.trim();
		System.out.println(s1 + "-"+ s1.length());
		System.out.println();
		System.out.println();

		s2 = s1.trim();
		System.out.println(s1 + "-"+ s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println(s1 == s2);
		System.out.println();
		
		s1 = "  abc bbc   ";
		s2 = s1.replace(" ", "");
		System.out.println(s1 + "-"+ s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println();

		s1 = "  abc bbc   ";
		s2 = s1.trim();
		s3 = s1.strip();
		System.out.println(s1 + "-"+ s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println(s3 + "-"+ s3.length());
		System.out.println();
		
		s2 = s1.stripLeading();
		System.out.println(s2 + "-"+ s2.length());
		System.out.println();
		
		s2 = s1.stripTrailing();
		System.out.println(s2 + "-"+ s2.length());
		System.out.println();
		
		
		s1 = "\0  abc bbc   ";
		s2 = s1.trim();		//can remove null character also, it considers \0 also as a kind of space character
		s3 = s1.strip();  	//can not remove null character, it considers it as normal character
		System.out.println(s1 + "-"+ s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println(s3 + "-"+ s3.length());
		System.out.println();
		
		s1 = " \0 abc bbc   ";
		s2 = s1.trim();		//can remove null character also, it considers \0 also as a kind of space character
		s3 = s1.strip();  	//can not remove null character, it considers it as normal character
		System.out.println(s1 + "-"+s1.length());
		System.out.println(s2 + "-"+ s2.length());
		System.out.println(s3 + "-"+ s3.length());
		System.out.println();
		
	/*
	 * 43. public static String format(String format, Object... args)	
	 * 44. public String formatted(Object... args)	
	 */
		
		s2 = String.format("The adding of %d and %d is %d", 10, 20, 30);
		System.out.println(s2);
		
		s1 = "The adding of %d and %d is %d";
		s2 = s1.formatted(10, 20, 30);
		System.out.println(s2);
		System.out.println();
		
	/*
	 * 45. public String intern() 	
	 * 		- for adding String object to Constant pool or
	 * 		- for returning existing String object from the pool 
	 * 	 we must use this method
	 */
		s1 = "a"; 				//added to pool by default
		s2 = new String("a");	//not added to the pool
		
		s1 = "b";						//added to the pool by default
		s2 = new String("b").intern();	//returns the String "b" from the pool
		System.out.println(s1 == s2);
		
		s1 = String.valueOf(10);		//not added to the pool
		s2 = "10";						//added to the pool, diff object
		System.out.println(s1 == s2);

		s1 = String.valueOf(20).intern();	//added to the pool and returns
		s2 = "20";							//returns from the pool
		System.out.println(s1 == s2);

		
	}
}


/*
 * 7 Categories
 * =====================
 * 1. checking
 * 		isEmpty(), isBlank(), length(), hashCode()
 * 
 * 2. comparing
 * 		equals(), equalsIC(), compareTo(), comparToIC(), cE()
 *      	
 * 3. searching or verifying
 * 		contains(), statsWith(), endsWith(), indexOf(), lastIndexOf()
 * 
 * 4. retrieving 
 * 		chatAt(), substring(), subSequence(), split(), chars()
 * 
 * 5. converting
 * 		toString(), toCharArray(), getBytes(), valueOf()
 * 
 * 6. modifying
 * 		concat(), join(), replace(), replaceAll(), replaceFirst(), 
 *      trim(), strip(), sL(), sT(), format(), formatted()
 * 
 * 7. Java new feature Text blocks(""" text """)  based methods
 * 		Stream<String> lines()
 * 		String indent(int n)
 * 		public String stripIndent()
 * 
 * 		public <R> R transform(Function<? super String,? extends R> f)
 * 		public String translateEscapes()
 * 		public String repeat(int count)
 * 
 */


