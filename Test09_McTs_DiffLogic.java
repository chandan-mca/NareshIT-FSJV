/**
 * Approach #2: Multiple classes -> multiple instances
 * 	- In this approach we can execute different logics
 *    with same value or different values
 * 
 * Develop a multi-thread program to run two tasks by using two custom threads
 * 	task #1: add numbers 1-20, print each iteration result
 * 	task #2: subtract numbers 1-20, print each iteration result
 * 
 * use main thread only for starting custom threads
 */
class AddThread extends Thread {
	@Override
	public void run() {
		int sum = 1;
		for(int i=2; i<=3; i++) {
			sum = sum + i;
			System.out.println("summation: "+ sum);
		}
	}
}

class SubThread extends Thread {
	@Override
	public void run() {
		int sub = 1;
		for(int i=2; i<=3; i++) {
			sub = sub - i;
			System.out.println("subtraction: "+ sub);
		}
	}
}

class MulThread extends Thread {
	@Override
	public void run() {
		int mul = 1;
		for(int i=2; i<=3; i++) {
			mul = mul * i;
			System.out.println("division: "+ mul);
		}
	}
}

public class Test09_McTs_DiffLogic {
	public static void main(String[] args) {
		System.out.println("main start");
		
		AddThread at = new AddThread();
		SubThread st = new SubThread();
		MulThread mt = new MulThread();
				
		at.start();
		st.start();
		mt.start();
		
		System.out.println("main end");
	}
}
