/**
 * Inter-thread communication
 * =============================
 * The process of executing two threads sequentially and alternatively with 
 * communication when they access same object, for modifying and reading 
 * the object data is called inter-thread communication
 * 
 * To develop inter-thread communication we must use three things 
 * 		1. synchronized keyword
 * 		2. wait()
 * 		3. notify()/notifyAll()
 * 
 * - Synchronized keyword is for achieving sequential flow of execution 
 * - wait() and notify() methods are for achieving alternative flow of execution 
 *  
 * - wait() method
 * 		1. unlocks its current object then 
 * 		2. pauses currently running thread
 * 	       and allows other thread to acquire lock on this object
 *         and executes its logic
 * 
 * - notify() and notifyAll() methods
 * 		1. notifies to other waiting thread to come out of its waiting state 
 *        and ready to run after acquiring lock on this current object 
 */
class Factory {
	
	private int items;
	private boolean itemsAvailable;
	
	synchronized void produce(int items) {
		if(itemsAvailable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		this.items = this.items + items;
		System.out.println("items produced: "+ items);
		itemsAvailable = true;
		
		notify();
	}
	
	synchronized void consume(int items) {
		if(!itemsAvailable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.items = this.items - items;
		System.out.println("items consumed: " + items );
		itemsAvailable = false;
		
		notify();
	}
}

class Producer implements Runnable {
	
	private Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			factory.produce(i);
		}
	}
}

class Consumer implements Runnable {
	private Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			factory.consume(i);
		}
	}
}

public class Test31_ITC {
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Producer producer = new Producer(factory);
		Consumer consumer = new Consumer(factory);
		
		Thread th1 = new Thread(producer); 
		Thread th2 = new Thread(consumer);
		
		th1.start();
		th2.start();
	}
}

