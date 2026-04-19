class Bbc {
	synchronized void m1() {
		try {
			String name = Thread.currentThread().getName();
			
			System.out.println(name + " is waiting for " + this + " lock");
				wait();
			System.out.println(name + " after nofitying");
		} catch (InterruptedException   e) {
			e.printStackTrace();
		}
		
	}
	synchronized void m2() {
			String name = Thread.currentThread().getName();
			
			System.out.println(name + " is notifying " + this + " lock");
				notify();
			System.out.println(name + " after nofitying");
		
	}
}

class WaitThread extends Thread {
	private Bbc bbc;

	public WaitThread(Bbc bbc) {
		this.bbc = bbc;
	}

	@Override
	public void run() {
		bbc.m1();
	}
}

class NotifyThread extends Thread {
	private Bbc bbc;
	
	public NotifyThread(Bbc bbc) {
		this.bbc = bbc;
	}
	
	@Override
	public void run() {
		bbc.m2();
	}
}

public class Test34_wait_notify_diffObjs {
	public static void main(String[] args) {
		//case #1 wait() and notify methods are called by using same object b1
	/*	
		Bbc b1 = new Bbc();
		
		new WaitThread(b1).start();
		new NotifyThread(b1).start();
		
	*/	
		Bbc b1 = new Bbc();
		Bbc b2 = new Bbc();
		
		new WaitThread(b1).start();
		new NotifyThread(b2).start();
	}
}
