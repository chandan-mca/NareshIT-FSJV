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
class DisplayNumbers3{
	
//	synchronized void print1To20() {
	void print1To20() {
		String name = Thread.currentThread().getName();
		System.out.println("print1To20 started in "+ name);

		for(int i=1; i<=20; i++) {
			System.out.println(name + " run i: "+ i);
		}
		
		System.out.println("print1to20 end in "+ name);
	}
	
	synchronized void print30To50() {
		String name = Thread.currentThread().getName();
		System.out.println("print30To50 started in "+ name);
		
		for(int i=30; i<=50; i++) {
			System.out.println(name + " run i: "+ i);
		}
		
		System.out.println("print30to50 end in "+ name);
	}
	
}

class NonSyncThread extends Thread {
	private DisplayNumbers3 dn;
	
	public NonSyncThread(DisplayNumbers3 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		 dn.print1To20(); 
	}
}

class SyncThread extends Thread {
	
	private DisplayNumbers3 dn;
	
	public SyncThread(DisplayNumbers3 dn) {
		this.dn = dn;
	}
	
	@Override
	public void run() {
		dn.print30To50(); 
	}
}

public class Test29_Sync_Nsync_Methods {
	public static void main(String[] args) {
		DisplayNumbers3 dn = new DisplayNumbers3();
		
		NonSyncThread th1 = new NonSyncThread(dn);
		SyncThread    th2 = new SyncThread(dn);
		
		th1.start();
		th2.start();
		
	}
}