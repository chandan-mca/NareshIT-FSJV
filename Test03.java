/*
- A constructor is meant for initializing an object's NSVs with given values
- The given values can be
	 1. either hard coded values (fixed values) or
	 2. reading from keyboard or from file or from DB or 
	 3. reading from other programmer as argument via paramters

- For initializing an object either with hard coded values or
  reading from keyboard or from file or from DB, 
  we can create non-parameterized constructor

- For initializing object with other programmer given values
  we must define parameterized constructor

- Below program shows initializing object with hard coded values
  by using no-param constructor
	
*/
class Example {
	private int x;
	private int y;

	Example() {
		System.out.println("No-param constructor");
		x = 10;
		y = 20;
	}

	public static void main(String[] args) {
		System.out.println("main ");

		Example e1 = new Example();

		Example e2 = new Example();

		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}
