//BuildingRVs.java
import java.util.Scanner;

class BuildingRVs {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//Room r = new Room();  //CE: c f s Room(), 
						//because compiler does not add default constructor

		//System.out.print("Enter l: ");
		//System.out.print("Enter b: ");
		//Room r = new Room(scn.nextDouble(), scn.nextDouble()); 
						//how to prompt message to end-user

		System.out.print("Enter l: ");		
		double l = scn.nextDouble();

		System.out.print("Enter b: ");		
		double b = scn.nextDouble();

		Room r1 = new Room(l, b);
		
		System.out.println("r1 values");
		r1.display();

		System.out.println();
		r1.findArea();

		System.out.println();
	
		System.out.print("\nEnter modified l: ");		
		r1.setL(scn.nextDouble());

		System.out.print("Enter modified b: ");		
		r1.setB(scn.nextDouble());

		System.out.println("r1 changed values");
		r1.display();

		System.out.println();
		r1.findArea();
/**/
	}
}
