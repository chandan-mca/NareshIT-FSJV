/**
 * Create three custom threads for executing 3 user defined methods concurrently 
 * to show when one method execution is paused other method is executed in another 
 * thread 
 */

class M1Thread extends Thread {
	@Override
	public void run() {
		Example.m1();
	}
}

class M2Thread extends Thread {
	@Override
	public void run() {
		Example.m2();
	}
}

class M3Thread extends Thread {
	@Override
	public void run() {
		Example.m3();
	}
}


public class Test10_McTs_UDMs_SaveTime {
	public static void main(String[] args) {
		new M1Thread().start();
		new M2Thread().start();
		new M3Thread().start();
	}
}
