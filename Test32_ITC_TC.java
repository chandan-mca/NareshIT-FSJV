/**
 * Develop a multi-thread program to print 
 * 		even numbers from one thread and odd numbers from other thread
 * in the given range 1-20
 * 
 * we must get result as sequence numbers
 * 	1 2 3 4 5 6 7 8 9 19 11 12 13 14 15 16 17 18 19 20
 * 	
 */

class PrintNumbers {
	private boolean printed; 
	
	synchronized void printOdd(int num) {
		if(printed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(num + " ");
		printed = true;
		
		notify();
	}
	
	synchronized void printEven(int num) {
		if(!printed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(num + " ");
		printed = false;
		
		notify();
	}
}

class OddRunnable implements Runnable {
	private PrintNumbers numbers;

	public OddRunnable(PrintNumbers numbers) {
		this.numbers = numbers;
	}

	@Override
	public void run() {
		for(int i=1; i<=20; i=i+2) {
			numbers.printOdd(i);
		}
	}
}

class EvenRunnable implements Runnable {
	private PrintNumbers numbers;
	
	public EvenRunnable(PrintNumbers numbers) {
		this.numbers = numbers;
	}
	
	@Override
	public void run() {
		for(int i=2; i<=20; i=i+2) {
			numbers.printEven(i);
		}
	}
}

public class Test32_ITC_TC {
	public static void main(String[] args) {
		
		PrintNumbers numbers = new PrintNumbers();
		
		new Thread(new OddRunnable(numbers )).start();
		new Thread(new EvenRunnable(numbers)).start();
	} 
}
