/*
 * Develop a program to reverse the words in the string
 * 	I/P: How Are You?
 * 	O/P: You? Are How
 *
 * Algorithm to develop above program
 *
 * 		//"How Are You?"				<- s1
 *			//"How" "Are" "You?"		<- s1.split(" "); => String[] words
 *
			//"You? "						<- words[i=length()-1]
			//"You? " + "Are "				<- words[i=length()-1] + words[i-1]
			//"You? " + "Are " + "How "		<- words[i=length()-1] + words[i-1] + words[i-2]
			  
		//"You? Are How "			<- s1.trim()
		//"You? Are How"

 */
import java.util.Scanner;
public class Test16_project_reverseWords {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String s1 = scn.nextLine();
		System.out.println("O S: "+ s1);
	
		String[] words = s1.split(" ");
		//System.out.println(Arrays.toString(words));
		String resString = "";
		for(int i=words.length-1; i>=0; i-- ) {
			resString = resString + " " + words[i];
		}
		resString = resString.trim();
				
		System.out.println("R S: "+ resString );
	}
}
