/**
 * The synchronization is the process of executing multiple threads sequentially 
 *  when they access or share same object
 *  
 * If we allow two threads to execute concurrently on the same object 
 * the object data is modified inconsistently and we get wrong results
 * 
 * Because in the middle of one thread,  another thread is executed. 
 * The first thread value are replaced with second thread values, 
 * when first thread resumes its execution it gets 2nd thread values. 
 * Hence we will get wrong values
 * 
 * The solution for this problem is 
 *   don't allow second thread execution 
 *   until first thread execution is completed fully.
 *   
 * For developing synchronization we must declare the method as 'synchronized'
 * 
 * The 'synchronized' is a modifier keyword. It is used to declare a method as a 
 * synchronized for executing its logic sequentially in a multiple threads 
 * when it is called by using same object in two different threads. 
 * 
 * When we call synchronized method, first its current object is a locked 
 * and this object is not available for other threads until this synchronized 
 * method execution completed. After synchronized method execution is completed, 
 * this current object is unlocked and it is available for second thread. 
 * 
 * Hence with synchronization we will get sequential flow of execution 
 * we will not have inconsistent data modification and we will get correct 
 * results 
 *    
 * Synchronization provides sequential flow of execution only when two threads 
 * are accessing the same object. If two threads are accessing different objects, 
 * synchronization does not provide sequential flow of execution it will be 
 * concurrent flow because each thread locking its own object
 * 
 * Note: The synchronized keyword doesn't lock the method 
 *       it locks the current object of this method
 *    
 */
class Addition {
	
	private int x;
	private int y;
	
//	void add(int x, int y) {
	synchronized void add(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		try {	Thread.sleep(1000);	} 
		catch (InterruptedException e) {}
		
		int res = this.x + this.y;
		System.out.println(
				Thread.currentThread().getName() + " res: " + res);
		
	}
}

class Thread1 extends Thread {
	
	private Addition a;
	
	public Thread1(Addition a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.add(50, 60);
	}
}

class Thread2 extends Thread {
	
	private Addition a;
	
	public Thread2(Addition a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}

public class Test25_Synchronized {
	public static void main(String[] args) {
	/*	
		Addition a1 = new Addition(); 
		
		Thread1 th1 = new Thread1(a1);	
		Thread2 th2 = new Thread2(a1);
		
		th1.start();
		th2.start();
	*/
		Addition a1 = new Addition(); 
		Addition a2 = new Addition(); 
		
		Thread1 th1 = new Thread1(a1);	
		Thread2 th2 = new Thread2(a2);
		
		th1.start();
		th2.start();
	}
}
