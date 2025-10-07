//Identify whether below program static or dynamic in 
//creating different classes objects?
class Test00_StaticLoading {
	public static void main(String[] args){
		Object obj = new A();
		System.out.println(obj);
	}
}

//Any number of times we run this test class,
//it always loads and instantiates class A only
//so this class is called as static nature class

//to load & instantiate diff classes dynamically at runtime
//we must use Reflection API 

