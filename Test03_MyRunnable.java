/*
19. Steps to create a custom thread implementing from Runnable interface
  	#1: create a new class deriving from Runnable interface
  	#2: implement run() method with the logic to be executed in custom thread
  	#3: create this implementation class object 
  	#4: create Thread class object by passing mr object
        and then call start() method by using Thread object
 
20. Below program explains creating custom threads 
    by implementing Runnable interface 
*/

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test03_MyRunnable {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyRunnable mr = new MyRunnable();
		//mr.start();
		
		Thread th1 = new Thread(mr); 
		th1.start();
		
		System.out.println("main end");
	}	
}



















