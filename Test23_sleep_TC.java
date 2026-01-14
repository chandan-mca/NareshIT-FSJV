/*
 * Develop a program to print numbers 1-20 from custom thread
 * we must see each number printing on console 
 */

class MyThread14 extends Thread {
	@Override
	public void run() {
		int i=1;
		while(i<=20) {
			 System.out.print(i + " ");
				 try {Thread.sleep(200);} 
				 catch (InterruptedException e) {}
			i++;
		}
	}
}

public class Test23_sleep_TC {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread14 mt1 = new MyThread14();
		mt1.start();
		
		System.out.println("main end");
	}
}
