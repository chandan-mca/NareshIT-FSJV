class Bus {
	void breaks(){
		System.out.println("Bus has normal breaks");
	}
}

class RedBus extends Bus  {
								//reusing the above method logic 
								//here for RB
}

class Volvo extends Bus {
	void breaks(){				//overriding Bus class method here in Volvo class
		System.out.println("Volvo has power breaks");	//for chaging the logic given in 
	}											  //super class Bus as per Volvo requirement
}

class Driver {
	public static void main(String[] args) {
		Bus bus;

		bus = new RedBus();			
		bus.breaks();				
			//executed from class Bus, 
			//becuase it is not overridden in class RedBus 						

		bus = new Volvo();			
		bus.breaks();				
			//executed from class Volvo
			//because it is overridden in class Volvo
	}
}

