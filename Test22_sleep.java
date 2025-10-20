
class MyThread13 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed");
	} 
}
public class Test22_sleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread13 mt = new MyThread13();
		mt.start();
		
		Thread.sleep(5000); 
					//forcing Thread scheduler to pause CRT main thread
					//for given time(ms) and allow other waiting threads to execute
						
		System.out.println("main end");
		
	}
}
