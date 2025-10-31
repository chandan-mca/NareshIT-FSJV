class MyThread15 extends Thread {
	@Override
	public void run() {

		System.out.println("run start");
		
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
		
		System.out.println("run end");

	}
}

public class Test24_join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread15 mt1 = new MyThread15();
		mt1.start();
		
		//mt1.join();
		//mt1.join(2000);
		//mt1.join(7000);
		mt1.sleep(7000);
		
		System.out.println("main end");
	}
}
