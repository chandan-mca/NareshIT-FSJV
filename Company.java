import java.util.Scanner;
class Company {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);


//		Employee e1 = 
//			new Employee(scn.nextInt(), scn.next(), scn.nextDoube(), scn.next()	
//											new Address(scn.next(), scn.next()));


		System.out.println("Enter Employee object details");

		System.out.print("  Enter eno\t: ");
		int eno		= scn.nextInt();  scn.nextLine();

		System.out.print("  Enter ename\t: ");
		String ename = scn.nextLine();

		System.out.print("  Enter sal\t: ");
		double sal		= scn.nextDouble(); scn.nextLine();

		System.out.print("  Enter dept\t: ");
		String dept		= scn.nextLine();

		System.out.println("\nEnter Employee object address details");
		System.out.print("  Enter strnum\t: ");
		String strNum		= scn.nextLine();

		System.out.print("  Enter city\t: ");
		String city		= scn.nextLine();

		Employee e1 = 
			new Employee(eno, ename, sal, dept, new Address(strNum, city));

		System.out.println("Employee object1 is created");
	
		System.out.println("\ne1 object values");
		e1.display();

	}
}
