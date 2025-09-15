class Building {
	public static void main(String[] args) {
		//Room r = new Room();  //CE: c f s Room(), 
		//r.display();			//because compiler does not add 
								//default constructor

		Room r1 = new Room(100, 50); //initializing Room object

		System.out.println("r1 values");
		r1.display();

		System.out.println();
		r1.findArea();

		System.out.println();
		r1.setL(90);			//modifying Room object
		r1.setB(30);

		System.out.println("r1 changed values");
		r1.display();

		System.out.println();
		r1.findArea();
/**/
	}
}


