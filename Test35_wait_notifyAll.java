class Cbc {
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
				//notify();
				notifyAll();
			System.out.println(name + " after nofitying");
		
	}
}

class WaitThread1 extends Thread {
	private Cbc cbc;

	public WaitThread1(Cbc cbc) {
		this.cbc = cbc;
	}

	@Override
	public void run() {
		cbc.m1();
	}
}

class NotifyAllThread extends Thread {
	private Cbc cbc;
	
	public NotifyAllThread(Cbc cbc) {
		this.cbc = cbc;
	}
	
	@Override
	public void run() {
		cbc.m2();
	}
}

public class Test35_wait_notifyAll {
	public static void main(String[] args) throws InterruptedException {
		//case #1 wait() and notifyAll methods are called by using same object b1

		Cbc c1 = new Cbc();
		
		new WaitThread1(c1).start();
		new WaitThread1(c1).start();
		new WaitThread1(c1).start();
		
		Thread.sleep(5000);
		
		new NotifyAllThread(c1).start();
		
	}
}
