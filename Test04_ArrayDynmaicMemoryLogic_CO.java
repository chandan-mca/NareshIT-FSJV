import java.util.Arrays;
import java.util.Scanner;

public class Test04_ArrayDynmaicMemoryLogic_CO {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many object do you want to store?: ");
		int numbeOfValues = scn.nextInt(); scn.nextLine();
		
		//dynamic memory
		Example[] ea = new Example[numbeOfValues];
		System.out.println("Array with "+numbeOfValues+" locations with default values: "+Arrays.toString(ea));
		
		//dynamic logic for creating and storing Example objects in array object
		for(int i=0; i<numbeOfValues; i++) {
			System.out.println("\nEnter object"+(i+1)+ " values");
			
			System.out.print("  Enter x: ");
			int x = scn.nextInt();
			
			System.out.print("  Enter y: ");
			int y = scn.nextInt();
			
			ea[i] = new Example(x, y);
			System.out.println(Arrays.toString(ea)); 
		}
		
	}
}
