/**
 * redevelop above program by using Runnable interface
 */
class MyRunnable2 implements Runnable{
	@Override
	public void run() {						//=== custom thread ====
		//task2 logic
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+ i);
		}
	}
}

public class Test06_Assignment {
	public static void main(String[] args) { //=== main thread ===
		
		MyRunnable2 mr1 = new MyRunnable2();
		Thread th1 = new Thread(mr1);
		th1.start(); //makes this custom thread is 'ready-to-run'
		
		//task1 logic -> printing sequence of numbers from 1-20
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}
		
	}
}