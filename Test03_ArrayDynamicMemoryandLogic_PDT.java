import java.util.Arrays;
import java.util.Scanner;

public class Test03_ArrayDynamicMemoryandLogic_PDT {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many values do you want to store?: ");
		int numbeOfValues = scn.nextInt(); scn.nextLine();

		//dynamic memory
		int[] ia = new int[numbeOfValues];
		System.out.println("Array with default values: "+Arrays.toString(ia));
		
		//dynamic logic for reading and storing values in array object
		for(int i=0; i<numbeOfValues; i++) {
			System.out.print("Enter value"+(i+1)+": ");
			ia[i] = scn.nextInt();
			System.out.println(Arrays.toString(ia)); 
		}
		System.out.println();
		
		//dynamic logic to print
		System.out.println("Array after initialization: " + Arrays.toString(ia)); 
		
	}
}
