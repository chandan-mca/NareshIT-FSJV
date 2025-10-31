
class MyThread12 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed");
	} 
}
public class Test21_yield {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread12 mt = new MyThread12();
		mt.start();
		
		Thread.yield(); 
					//request Thread scheduler to pause CRT main thread
					//and allow other waiting threads to execute
				//this request may accept or ignore by thread scheduler
		
		System.out.println("main end");
		
	}
}
