/**
 * 09. Below program explains converting WCO to PV
 *     - For performing this conversion in all wrapper classes 
 *       we have a getter method whose name starts with primitive data type name
 *     
 *     - Because this getter method name starts with primitive data type 
 *       the getter method is also called as typeValue() method
 *      
 *     - In the Number classes [Byte, Short, Integer, Long, Float, and Double]
 *       we have 6 typeValue() method for converting one PV to another type  
 *     	
 *     		public byte  byteValue()
 *     		public short shortValue()
 *     		public int   intValue()
 *     		public long  longValue()
 *     		public float floatValue()
 *     		public double doubleValue()
 *     
 *    - In Character class we have only one typeValue() method
 *     		public char charValue()
 *      
 *    - In Boolean class we have only one typeValue() method
 *     		public boolean booleanValue()
 *      
 *     ==========================================================================
 *         Conversions        Examples      Constructors     Methods
 *     ==========================================================================
 *        1. PV  to WCO		5 	 -> I(5)	  WC(pdt)	static WC  valueOf(pdt)	
 *        2. WCO to PV	    I(5) -> 5			---			   PDT <type>Value()
 *        3. PSO to WCO     "5"  -> I(5)
 *        4. PSO to PV		"5"	 -> 5                   	
 *        5. WCO to PSO		I(5) -> "5"                   	
 *        6. PV  to PSO		5    -> "5"                   	
 *     ==========================================================================
 */
import java.util.ArrayList;

public class Test02_WCOtoPV {
	public static void main(String[] args) {
		
		Integer io = Integer.valueOf(50);	
		byte 	b1 = io.byteValue();
		short 	s1 = io.shortValue();
		int 	i1 = io.intValue();
		long 	l1 = io.longValue();
		float 	f1 = io.floatValue();
		double 	d1 = io.doubleValue();
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
	//============================================================	
		ArrayList<Object> al = new ArrayList<>();

	//storing primitive values in collection by converting them from PV to WCO 
		al.add(Integer.valueOf(50));		//converting PV to WCO
		al.add(Double.valueOf(50.0));
		al.add(Character.valueOf('a'));
		al.add(Boolean.valueOf(true));
		
		System.out.println();
		
	//retrieving primitive values from collection by converting them from WCO to PV 
		
		//retrieving Integer object from collection 	
		Object obj = al.get(0); 				//Object(I(50))
		
		//converting Object type to Integer type
		Integer io1 = (Integer)obj;		//I(50)
		
		//converting Integer object to int type
		int     i2 = io1.intValue();	//50
		System.out.println(i2);
		
		//Retrieving and converting Double object to double type
		Double do1 = (Double)al.get(1); //Object(D(50.0)) -> D(50.0)
		double d2  = do1.doubleValue();	//D(50.0) -> 50.0
		System.out.println(d2);
		
		//Retrieving and converting Character object to char type
		char ch2 = ((Character)al.get(2)).charValue();
		System.out.println(ch2);
		
		//Retrieving and converting Boolean object to boolean type
		boolean bo2 = ((Boolean)al.get(3)).booleanValue();
		System.out.println(bo2);
		
	//============================================================
		Integer io2 = Integer.valueOf(97);
		//char ch3 = io2.charValue(); /CE: c f s charValue() in Integer class
		char ch3 = (char)io2.intValue();
		System.out.println(ch3);
	//============================================================

	}
	
}
