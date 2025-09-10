/*
12. How can we run logic in custom thread?
	- by using run() method
	
	- for running logic in custom thread
	  we must place our logic in run() method 

13. What is run() method?
	- The run() method is a predefined method	

14. In which class or interface run() method is available?
 	- It is available 
 		1.  in Runnable interface and also 
 		2.	in Thread class
 		
	- Originally run() method is available in Runnable interface 
	   as abstract method 
	  
	- and it is implemented in Thread class with the logic 
	  'calling run() of the passed Runnable implemented class'
	
15. What is use of run() method?	
	- it is used for placing our logic  
	  for running it in custom thread
	
16. How can we place our logic in custom thread?	   	  
	 - we must override run() method either 
	  from Thread class or from Runnable interface

17. How many ways we can create custom thread?
	- For creating custom thread and 
	  for running logic in custom thread
	  we have 3 ways
		1. extends from Thread class
		2. implements from Runnable interface
		3. implements from Callable interface
		
	- in all three approaches internally 
	  'Thread class object is created and start() method' is
	  called for starting thread and running logic  	

18. Steps to create a custom thread extends from class Thread?
		#1: create a new class deriving from class Thread
		#2: Override run() method with our logic to be executed in custom thread
		#3: create this sub class object and call start() method by using this object

19. Sample program to create a custom thread deriving from Thread class?
*/
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

class Test02_MyThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread mt1 = new MyThread();
		mt1.start(); //custom thread is created and
					 //made it as ready-to-run 
					
		System.out.println("main end");
	}
}
















