/*
Constructor chainging
=======================
-- Calling one constructor from other constructor by using this keyword 
   is called constructor chaining.

-- If we call constructor by using this keyword
   the second constructor logic is also executed 
   for the same current object 

-- if we want to execute same logic for other paramterized
   constructor, we must develop constructor chainging
  

*/
class  Example {
	int x ;
	int y ;

	Example() {
		this(10, 20);
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

class Test03{
	public static void main(String[] args) {
		Example e1 = new Example();
		System.out.println(e1.x + "   " +e1.y);

	}
}
