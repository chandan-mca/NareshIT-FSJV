/**
 * Develop a multithread program to execute two tasks concurrently
 * 	1. print 1-20
 * 	2. print 20-1
 *  
 */
class MyThread2 extends Thread {
	@Override
	public void run() {						//=== custom thread ====
		//task2 logic
		for(int i=20; i>=1; i--) {
			System.out.println("run i: "+ i);
		}
	}
}

public class Test05_Assignment {
	public static void main(String[] args) { //=== main thread ===
		
		MyThread2 mt1 = new MyThread2();
		mt1.start(); //makes this custom thread is 'ready-to-run'
		
		//task1 logic -> printing sequence of numbers from 1-20
		for(int i=1; i<=20; i++) {
			System.out.println("main i: "+ i);
		}
		
	}
}
