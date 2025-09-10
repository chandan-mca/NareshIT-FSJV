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
     multitasking					   is called multithreading
     
  2. Multitasking comes  			2. Multithreading comes 
     at OS level					   at process level or 
     									 Programming Language level
     
  3. Multitasking is heavy weight	3. Multithreading is light weight
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
	concurrent flow of execution not parallel
	
5. Does Java provide MTasking or MThreading?
 	- MultiThreading (because it is run by a process that is JVM)

6. What is a thread?
	- A thread is an independent sequential flow of execution path
	
	- Java is a multithread programming language
	- It means inside JVM we can have multiple threads

7. What is multithreading and why multithreading?
	- The process of creating multiple threads for running multiple 
	  independent tasks concurrently to complete their execution in less time 
	  by using CPU ideal time effectively is called multithreading

8. Advantages of Multithreading?
	- We can run multiple independent tasks concurrently at a time
	- We can complete project execution fast
	- We can use CPU ideal time effectively
	- We use CPU resources effectively

9. Need of this chapter Multithreading?
	- In this chapter 
		- we do not learn "how to develop logic"
		- we learn how to 'run logic concurrent'.
		
	- In previous chapters we run tasks (methods) 
	  sequentially by using single thread main thread
	  
	- The sequential flow of execution takes more time
	  because when one task execution is paused,
	  we can not use that paused time to run other task
	  
	- In this chapter we learn 
		  1. creating our own new threads
		  2. running tasks or methods concurrently in those new threads
	  	 
10. What is a custom thread or user defined thread?
	- A thread newly created by a programmer is called custom thread

11. How can we create custom thread?
	- by using class Thread

	- For creating custom thread 
	    'Create Thread class object and 
	     call start() method'

//12. What is the problem with Thread class way of creating CT? 
	//We able to create custom thread
    //but we unable to execute logic in custom thread
    //for this purpose we must use run() method

Below program explains creating custom thread 
from Thread class directly and its problem

*/
class  Test01_CustomThead {
	
	public static void main(String[] args){
		System.out.println("main start");
		
		Thread th1 = new Thread();
		th1.start();
		
		System.out.println("main end");
	}
}


