/*
- Defining multiple constructors with 
  different parameter types or list or order
  is called constructor overloading

- We will overload constrcutor for 
  initializing object's instance variables
	1. either by taking initialization values in 
       in type or list or order or 
	2. to develop different initialization logic

*/
class  Example{
	int x ;
	int y ;

	Example() {
		this.x = 10;
		this.y = 20;
		System.out.println("NPC is executed");
	}

	Example(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("I,I PC is executed");
	}

	Example(Example e){
		this.x = e.x;
		this.y = e.y;
		System.out.println("E PC is executed");
	}

}

/*
- when we overload constructor, the constructor is executed based on the argument 
we passed. When we call one constructor other constructors are not executed, only 
the invoked constructor is executed based on the argument types we passed.
*/
class Test03{
	public static void main(String[] args) {

		Example e1 = new Example(5, 6);
		System.out.println(e1.x + "   " +e1.y);

	}
}
