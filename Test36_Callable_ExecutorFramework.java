/*
Executor Framework/Executors/Executor services/ThreadPool
==========================================================
 Watch this video and Practice the program given below
 https://www.youtube.com/live/uRdF1Rhi71A?si=khq543D-N7iBtKaD
================================================================

1. Callable interface and diff between Runnable and Callable

2. Executor Framework, advatage of E F over Thread class threads
	1. Executor
	2. ExecutorSerivce
	3. ScheduledExecutorService
	4. Executors
	5. Future

3. Creating multiple custom threads in an automated way
   by using executor framework?

4. Differnt ways of creating custom thread?

5. 10 diffent ways of submitting logic to execute in custom thread


Callbale<T> interface and diff between Runnable and Callable
=========================================================
1. The Callable<T> is a functional interface. 
   It is available from Java 5v in java.util.concurrent package.

2. It is used for supplying logic to execute in a custom thread

3. It has below method 
	public T call() throws Exception

4. The difference between Runnable and Callable
	1. Both are meant for supplying logic to execute in custom thread

	2. Runnable.run() method 
		1. can not return a value or an object and
	    2. can not throw checked exception

	   Callable.call() method 
		1. can return a value or an object and
	    2. can throw checked exception

	3. Runnable implementation can be executed 
	   by using Thread class

	   But Callable implementation can not be executed 
	   by using Thread class. We must use Executor framework
	   ExectorSerivce interface

Executor Framework
==================
1. What is executor framework? 
   A set of class and interfaces those are used for
   creating collection of custom threads as one pool
   is called executor framework

2. Why is executor framework? 
   An executor framework is used for creating multiple threads 
   as one group(pool) in an automated way for reusing.

3. Advantages of 'Thread pool' over 'Thread class' based threads?
   1. The Executor framework provided threads are reusable
      we can use the same thread for running mulitple tasks.
      
	  Where the thread created from Thread class is not reusable
      once the submitted task is executed this thread is destoryed
      for running another task we must create one more new thread.
   
   2. Executor framework gives fast execution, 
      because threads are reusable, effectively managed
      and it is light weight.

      Thread calss based threads gives slow execution,
      becasue it is not reusable, repeated creation and detroying,
      and it is heavy weight.

   3. In projects using Executor framework is good choice

4. Executor framework API(Library, predefiend classes and interfaces)?
	Executor framework provides below 4 interfaces and 1 class
		1. Executor						(i)
		2. ExecutorSerivce				(i)
		3. ScheduledExecutorSerivce		(i)
		4. Executors					(c)
		5. Future						(i)


							  Executor
								/|\
								 |
							ExecutorSerivce
							/|\		/|\
							 |		 |
							 |	ScheduledExecutorSerivce
							 | 				/|\
						     |				 |
		AbstractExecutorService				 | 							
										     |
	ForkJoinPool	ThreadPoolExecutor		 |
                              /|\            | 
                               |             | 
							ScheduledThreadPoolExecutor						

5. Explain about Executor?
	1. Executor is an root interface of Executor framework
	2. It provides a method to supply Runnable tasks
	3. It have below method
		public void execute(Runnable task)

	4. The 2 problem with this interfaced are 
		1. can not accept Callable task
		2. there no method to shutdown the pool

	5. To solve above two problems 
	   We must use its sub interface ExecutorService

6. Explain about ExecutorSerivce?
	1. ExectorSerivce is a sub interface of Executor	
	2. It provides a method 
		1. for accepting Callable tasks
	    2. for shutdown the pool or service

	3. It have below methods for submitting tasks to threads
		1. public Future<?> submit(Runanble task)
		2. public Future<T> submit(Runanble task, T result)
		3. public Future<T> submit(Callable<T> task)
	
	4. It have below methods for shutting down the pool
		4. void				shutdown()		
		5. List<Runnable>	shutdownNow()		
		6. void				close()

7. Explian about Executors?
	1. Executors is factory class

	2. It provides static factory methods for creating and returning 
	   Executor, ExecutorService, ScheduledExecutorService, 
	   ThreadFactory, and Callable inerfaces implementation classes objects

	3. It proves below 5 methods for creating thread pool
		1. public static ExecutorService newSingleThreadExecutor()
		2. public static ExecutorService newFixedThreadPool(int nThreads)
		3. public static ExecutorService newCachedThreadPool()
		4. public static ScheduledExecutorService newSingleThreadScheduledExecutor()
		5. public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)

8. How many ways we can create thread pool?
	- we can create thread pool in 5 ways 
	  by using Exectors class factory methods
		1. newSingleThreadExecutor()
		2. newFixedThreadPool(int nThreads)
		3. newCachedThreadPool()
		4. newSingleThreadScheduledExecutor()
		5. newScheduledThreadPool(int corePoolSize)

*/
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

class MyRunnable implements Runnable {
	@Override 
	public void run(){
		String name = Thread.currentThread().getName();
		System.out.println("MR run  is executed in "+ name);

	}
}

class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		String name = Thread.currentThread().getName();
		System.out.println("MC call is executed in "+ name);
		return 5;
	}
}

public class Test36_Callable_ExecutorFramework {
	public static void main(String[] args) {
		System.out.println("main start");

		MyRunnable mr = new MyRunnable();
		//Thread th1 = new Thread(mr);
		//th1.start();
/*
		MyCallable mc = new MyCallable();
		//Thread th2 = new Thread(mc); //CE:
		//th2.start();

		//ExecutorService service = Executors.newSingleThreadExecutor();
		//ExecutorService service = Executors.newFixedThreadPool(3);
		ExecutorService service = Executors.newCachedThreadPool();
//		service.submit(mr);
//		service.submit(mc);
//		service.submit(mr);
//		service.submit(mc);
//		service.submit(mr);
//		service.submit(mc);
//		service.submit(mc);
//		service.submit(mc);

		for(int i=1; i<=100; i++){
			service.submit(mc);
		}
		
		service.shutdown();

		ExecutorService service2 = Executors.newSingleThreadExecutor();
		Future<Integer> future = service2.submit(mc);
		try{
			int res = future.get();
			System.out.println("Callable return value: " +res);
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch(ExecutionException e){
			e.printStackTrace();
		}
		service2.shutdown();

		ExecutorService service3 = Executors.newSingleThreadExecutor();
		Future<Integer> future2 = service3.submit(
									new Callable<Integer>() {
										@Override
										public Integer call() throws Exception{
											System.out.println("AIC call");
											//return 7;
											throw new Exception("For fun");
										}
									}
								);
		try{
			Integer res = future2.get();
			System.out.println("res: "+ res);
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch(ExecutionException e){
			//e.printStackTrace();
			Throwable t = e.getCause();
			t.printStackTrace();
		}
		service3.shutdown();
*/
		ExecutorService service4 = Executors.newSingleThreadExecutor();
		service4.submit(mr);
		service4.submit(mr);
		service4.submit(mr);
		service4.submit(mr);
		service4.submit(mr);

		//service4.shutdown();
		service4.shutdownNow();

		System.out.println("main end");


	
	}
}

