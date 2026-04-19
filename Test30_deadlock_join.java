/**
 * Deadlock is a situation where 2 threads are depend on each other 
 * and waiting on each other to complete
 * 
 * For example Thread1 is waiting for Thread2 to complete and at the same time
 * Thread2 is waiting for Thread1 to complete. Then that situation is called 
 * deadlock situation because both are not completed, application will be hanged.
 *  
 * When we make two threads inter-dependent on their execution 
 * deadlock will come automatically
 *  
 * We will get deadlock situation in the program in two cases 
 * 	1. Calling join() method on two threads each other
 * 	2. Calling synchronized method wrongly in two threads on same objects 
 *  
 *  Below program explains getting deadlock by using join() method
 *  	
 *  	In Thread1
 *       call th2.join()
 *       
 *  	In Thread2
 *       call th1.join()
 *       
 *     you will get deadlock  
 *  
 */
class DLJoinThread1 extends Thread {
	private DLJoinThread2 th2;
	
	public void setTh1(DLJoinThread2 th2) {
		this.th2 = th2;
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " started");
		System.out.println(name + " is waiting from th2 to completed");
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " end");
	}
}

class DLJoinThread2 extends Thread {
	private DLJoinThread1 th1;
	
	public void setTh1(DLJoinThread1 th1) {
		this.th1 = th1;
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " started");
		System.out.println(name + " is waiting from th1 to completed");
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " end");
	}
}


public class Test30_deadlock_join {
	public static void main(String[] args) {
		DLJoinThread1 th1 = new DLJoinThread1();
		DLJoinThread2 th2 = new DLJoinThread2();
		
		th1.setName("th1");
		th2.setName("th2");
		
		th1.setTh1(th2);
		th2.setTh1(th1);
		
		th1.start();
		th2.start();
	}
}
