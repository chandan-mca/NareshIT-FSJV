interface Shape {
	abstract void findArea();
}

class Rectangle implements Shape{
	double l, b;
	public void findArea(){
		System.out.println("Rectangle area: "+ (l*b)) ;
	}
}

class Square implements Shape{
	double s;
	public void findArea(){
		System.out.println("Square area: "+ (s*s)) ;
	}
}

class Circle implements Shape{
	static final double PI = 3.14;
	double r;
	public void findArea(){
		System.out.println("Circle area: "+ (PI * r * r)) ;
	}
}

class Painter{
	public static void main(String[] args){

		Shape s1;

		//s1 = new Shape(); 
		        //CE: Share is abstract can not be instantiated

		s1 = new Rectangle();	//here object is Rectangle class type	
		s1.findArea();			//hence findArea() method is executed from Rectangle class
								//Output is: 

		s1 = new Square();		//here object is Square class type
		s1.findArea();			//hence findArea() method is executed from Square class
								//Output is:

		s1 = new Circle();		//here object is Square class type
		s1.findArea();			//hence findArea() method is executed from Square class
								//Output is:

		System.out.println();

		Rectangle r1 = new Rectangle();		
		r1.l = 10;
		r1.b = 20;
		r1.findArea();

		Square s2  = new Square();		
		s2.s = 10;
		s2.findArea();

		Circle  c2 = new Circle();		
		c2.r = 10;
		c2.findArea();
		/**/
	}
}