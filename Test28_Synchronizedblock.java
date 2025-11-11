/**
 * - A local block that is declared with synchronized keyword 
 *   is synchronized block
 *   
 * - It is used for locking the given argument object or j.l.Class object
 *   for executing its block of statements sequentially from multiple threads
 *   when same object is shared to multiple threads
 *   
 *  	class Example {
 *  		void m1(Sample s) {
 *  			--- 
 *  			--- concurrent flow
 *  			--- 
 *  			synchronized(obj/class){
 *  				---
 *  				--- 	sequential flow
 *  				---
 *  			}
 *  			---
 *  			---	concurrent flow
 *  			---
 *  		}
 *  	}
 *  - For locking a current object, pass 'this' keyword as argument
 *  		synchronized(this) { }
 *  
 *  - For locking an argument object, pass 'parameter name' as argument
 *  		synchronized(s) { }
 *  
 *  - For locking a class, pass 'ClassName.class' as argument
 *  		synchronized(Example.class) { }
 *  		synchronized(Sample.class) { }
 *  
 *  - For locking multiple objects or multiple classes, 
 *    we must use nested synchronized blocks
 *    	
 *    
 *  	class Example {
 *  		void m1(Sample s) {
 *  			synchronized(this){ 	//CO is locked
 *  				synchronized(s){ 	     //AO is locked
 *  					synchronized(Example.class){  //Example class is locked
 *  						synchronized(Sample.class){ 	//Sample class is locked
 *  							---
 *  							--- 	sequential flow
 *  							---
 *  						}
 *  					}
 *  				}
 *  			}
 *  			---
 *  			---	concurrent flow
 *  			---
 *  		}
 *  	}
 *  
 *  - The differences between synchronized method and synchronized block
 *    =======================================================================
 *  		SM									SB
 *    =======================================================================
 *  	1. the object is locked for 		1. the object is locked only for 
 *         the entire method execution		   the block of statements
 *         
 *      2. it can lock only current object	2. it can lock either CO/CC/AO/OC
 *         or current class, can not lock      based the passed argument
 *         argument object or other class      		
 *         
 *      3. execution is slow because 		3. execution is fast because
 *         object is locked for the entire     object is locked only for 
 *         method logic  					   the necessary lines of code
 *    =======================================================================
 */
class DisplayNumbers2{
	void print1To20() {
	//synchronized void print1To20() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");

		for(int i=1; i<=20; i++) {
			System.out.println(name + " run i: "+ i);
		}
		
		synchronized(this) {
			for(int i=30; i<=50; i++) {
				System.out.println(name + " run i: "+ i);
			}
		}
		
		System.out.println(name + " end");
	}
	
}

class PrintSycnBlockThread1 extends Thread {
	private DisplayNumbers2 dn;
	
	public PrintSycnBlockThread1(DisplayNumbers2 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		 dn.print1To20(); 
	}
}

class PrintSyncBlockThread2 extends Thread {
	
	private DisplayNumbers2 dn;
	
	public PrintSyncBlockThread2(DisplayNumbers2 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		dn.print1To20(); 
	}
}

public class Test28_Synchronizedblock {
	public static void main(String[] args) {
		DisplayNumbers2 dn = new DisplayNumbers2();
		
		PrintSycnBlockThread1 pt1 = new PrintSycnBlockThread1(dn);
		PrintSyncBlockThread2 pt2 = new PrintSyncBlockThread2(dn);
		
		pt1.start();
		pt2.start();
		
	}
}