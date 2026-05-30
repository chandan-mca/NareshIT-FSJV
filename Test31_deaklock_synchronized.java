class FirstClass { 
	
	synchronized void m1(SecondClass sc) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " started, locked FC object");

		System.out.println(name + " paused");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " resumed");

		System.out.println(name + " called sc.m4()");
			sc.m4(); //th1 is paused for th2 to unlock sc object
		System.out.println(name + " is end");
	}
	
	synchronized void m2() {
		
	}
}
class SecondClass { 
	
	synchronized void m3(FirstClass fc) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " started, locked SC object");

		System.out.println(name + " paused");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " resumed");

		System.out.println(name + " called fc.m2()");
		
			fc.m2(); //th2 is paused for th1 to unlock fc object
		System.out.println(name + " is end");
	}
	
	synchronized void m4() {
		
	}
	
}

class DLSyncThread1 extends Thread { 
	private FirstClass fc;
	private SecondClass sc;
	
	public DLSyncThread1(FirstClass fc, SecondClass sc) {
		this.fc = fc;
		this.sc = sc;
	}
	
	@Override
	public void run() {
		fc.m1(sc);
	}
}

class DLSyncThread2 extends Thread { 
	private SecondClass sc;
	private FirstClass fc;
	
	public DLSyncThread2(SecondClass sc, FirstClass fc) {
		this.sc = sc;
		this.fc = fc;
	}
	
	@Override
	public void run() {
		sc.m3(fc);
	}
}


public class Test31_deaklock_synchronized {
	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		SecondClass sc = new SecondClass();
		
		new DLSyncThread1(fc, sc).start();
		new DLSyncThread2(sc, fc).start();
	}
}
