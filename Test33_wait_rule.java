class Abc {
	//void m1() {
	synchronized void m1() {
		//wait(); //Rule #1 CE: IE is not handled
		
		try {
			System.out.println("before wait() call");
				//wait();  //Rule #2: RE: IMSE, m1() method must be synchronized method
				wait(5000);
			System.out.println("after wait() call");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class Test33_wait_rule {
	public static void main(String[] args) {
		new Abc().m1();
	}
}
