/*
Approach #1: extending from Thread class
	1. create a class deriving from Thread class
	2. override run() method and place your logic to be executed in custom thread
	3. create this sub class object and call start() method 

*/

//1. Crate a new class deriving from Thread class
public class Test03_MyThread extends Thread {

	//2. override run() method to place logic to be executed in custom thread 
	@Override
	public void run() {
		System.out.println("\nrun start");
		
		System.out.println("run end");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		//3. create sub class object and call start() method
		Test03_MyThread mt = new Test03_MyThread();
		mt.start(); //-> it passes current object mt1 to JVM
					//and makes mt1 thread ready-to-run
				//it does not start custom thread 
				//and does not call run() method internally
			//When main method execution is either paused or completed
			//then JVM 
					//-> 1. starts custom thread 
					//-> 2. loads run() method from current thread object class 
					//       MyThread class and executed in this custom thread
		
		System.out.println("main end");
	}
}
