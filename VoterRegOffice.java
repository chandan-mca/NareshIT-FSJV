import java.util.Scanner;
class VoterRegOffice {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while(true){
			Voter v = new Voter();
			System.out.print("\nEnter name: ");
			v.setName(scn.nextLine());
			try{
				System.out.print("Enter age: ");
				v.setAge(scn.nextInt()); 

				System.out.println("Hi "+v.getName() + " your details are saved ");			
				System.out.println("Please collect your voter card ");
				System.out.println("from eseva after 30 days");			

			}catch(InputMismatchException e){
				System.out.println("Pass only integer");
				scn.nextLine();
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
