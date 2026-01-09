
public class Test07_Assign_Casting_Conversion {
	public static void main(String[] args) {
		
		int i1 = 50;
		long l1 = 50;
		double d1 = 50;
	
	//assignment	
		Integer io1 = new Integer(50);
		//Long lo1 = new Integer(50);
		//Double do1 = new Integer(50);
		
	//casting	
		//Double do2 = io1;			//CE: i c t
		//Double do3 = (Double)io1;	//CE: i c t
		
	//comparison
		System.out.println(10 == 10.0); //true
		//System.out.println(10.0 == 10.0); //true
		
		System.out.println(10 == 10.5); //false
		//System.out.println(10.0 == 10.5); //false
		
		Integer io5 = new Integer(10);	
		Double do5 = new Double(10.0);
		//System.out.println(io5 == do5); //CE: i c t 
		System.out.println(io5.equals(do5)); //no CE, but output is false 
		
	}
}


