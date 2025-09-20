/*
Multithreading
================
1. What is Multitasking?
	- The process of running multiple independent tasks 
	  at a time concurrently or simultaneous is called multitasking
	  
2. Types of Multitasking?
	- Process based multitasking (Multitasking)
	- Thread based multitasking  (Multithreading)
	
3. Differences between Multitasking and Multithreading?
  =======================================================================
			MTasking					MTheading
  ========================================================================
  1. Running multiple main tasks	1. Running multiple sub tasks
     concurrently is called 		   concurrently in a main task 
     multitasking					   is called multi-threading
     
  2. Multitasking comes  			2. Multi-threading comes 
     at OS level					   at process level or 
     									 Programming Language level
     
  3. Multitasking is heavy weight	3. Multi-threading is light weight
  	 means consumes more memory		   means consumes less memory and 
  	 and more time for context         less time for context switching
  	 switching                         because all threads share memory 
     								   within same process.
  ===================================================================
			
4. Different approaches to run multiple tasks?
	We have three ways
		1. Sequentially	-> [start -> end] [start -> end]
		2. Parallel		-> [start -> start -> end -> end]
		3. Concurrent	-> [start -> pause -> start -> pause -> resume -> end]
		
	At OS level or at programming level we will have 
	concurrent flow of execution but not parallel flow of execution
	
5. Whether Java provide MTasking or MThreading?
 	- MultiThreading (because it is run by a process called JVM)

6. What is a thread?
	- A thread is an independent sequential flow of execution path
	
	- Java is a multi-threaded programming language
	- It means inside JVM we can have multiple threads

7. What is multi-threading and why multi-threading?
	- The process of creating multiple threads for running multiple 
	  independent tasks concurrently to complete their execution in less time 
	  by using CPU ideal time effectively is called multi-threading

8. Advantages of Multi-threading?
	- We can run multiple independent tasks concurrently at a time
	- We can complete project execution fast
	- We can use CPU ideal time effectively
	- We use CPU resources effectively

9. What are we learning in this chapter Multi-threading?
	- In this chapter 
		- we do not learn "how to develop logic"
		- we learn how to 'run logic concurrently'.
		
	- In previous chapters we run tasks (methods) 
	  sequentially by using single thread main thread
	  
	- The sequential flow of execution takes more time
	  because when one task execution is paused,
	  we can not use that paused time to run other task
	  
	- In this chapter we will learn 
		  1. creating our own new threads
		  2. running tasks or methods concurrently in those new threads
	  	 
10. What is a custom thread or user defined thread?
	- A thread newly created by a programmer is called custom thread

11. How can we create custom thread?
	- by using class Thread

	- For creating custom thread 
	    'Create Thread class object and 
	     call start() method'

Below program explains creating custom thread 
from Thread class directly and its problem

*/
public class Test02_Thread {
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		//Thread object is created
		Thread th1 = new Thread();
		
		//start thread of execution for this thread object
		th1.start();
		
		System.out.println("main end");
		
	}
}

/*
12. What is the problem with Thread class in creating CT? 
	We able to create custom thread
    but we unable to execute logic in custom thread
    for executing logic in custom thread 
    we must place our logic in run() method
    
13. A short story on run() method? 
	1. The run() method is a predefined method,
	   it is available in Runnable interface as abstract method
	
	2. It is the initial point of custom thread execution
	   for executing logic in custom thread we must place
	   our logic in run() method
    
    4. It is originally declared in Runnable interface,
       and it is implemented in Thread class with the logic
       calling the run() method of  the passed Runnable implemented object class
    
    5. In order to place our logic, we must override run() method
       either from Runnable interface or from  Thread class
       
								       			interface Runnable {
								       			  public void run();
								       			}
								       
       
       			class Thread implements Runnable {				class MyRunnable implements Runnable{
       				
       				private Runnable target;					}	
       				
       				Thread() { }
       				
       				Thread(Runnable target) {				class MyThread extends Thread {
       					this.target = target;
       				}
       														}
       				@Override
       				public void run() {
       					if(target != null) 
       						target.run();
       				}
       			}
       
       
14. What is the 'main target' in multi-threading?
       1. creating custom thread?
       2. overriding run() method?
       
       - overriding run() method to place our logic 
         for executing in custom thread
       
15. How many ways we can override run() method?
       2 ways
       	1. extending from Thread class
       	2. implementing from Runnable interface
       	
16. How many ways we can create custom thread?
      We have 3 ways
	      For creating custom thread and 
  	        for overriding run() method to supply logic
	      to be executed in this custom thread
       
	       1. extending from Thread class
	       2. implementing from Runnable interface
	       3. implementing from Callable<T> interface
	          by executor framework
	          
	in all above three approaches either directly or indirectly
	Thread class is only used for creating custom thread object
       
*/
