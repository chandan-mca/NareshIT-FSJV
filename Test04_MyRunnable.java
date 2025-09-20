/*
Approach #2: implementing from Runnable class
	1. create a class deriving from Runnable interface
	2. implement run() method and place your logic to be executed in custom thread
	3. create this implementation class object 
	4. create Thread class object by passing this implementation class object
		and call start() method by using Thread object
*/


//1. Define a class implementing from Runnable interface
public class Test04_MyRunnable implements Runnable {
	
	//2. implementing run() method
	@Override
	public void run() {
		System.out.println("\nrun start");
		
		System.out.println("run end");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		//3. create implementation class object
		Test04_MyRunnable mr = new Test04_MyRunnable();
		//mr.start();
		
		//4. create Thread class object by pass MR object,
		//call start() method by using Thread object
		Thread th1 = new Thread(mr); 
		th1.start();
		
		System.out.println("main end");
	}
}
