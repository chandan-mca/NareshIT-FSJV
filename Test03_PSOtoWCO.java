import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * To perform PSO to WCO conversion
 * 	in all WCs except in Character class we have 
 * 		1. String parameter constructor and
 * 		2. String parameter valueOf() method
 * 
 * In Java 9v String parameter constructor is deprecated
 * we must use only valueOf() method for better performance 
 * 
 */
public class Test03_PSOtoWCO {
	
	public static void main(String[] args) throws IOException {
		
		//Converting PSO to WCO (retrieving PV from String object and storing WCO)
		//"50" -> Integer(50)
		Integer io1 = new Integer("50");
		Integer io2 = Integer.valueOf("50");
		System.out.println(io1);
		System.out.println(io2);
		
		
	//=======================================================
	//Rule: Inside "" we must place only the PV of this WC type with in its range.
	//if we place a letter or special character or incompatible PV or out of range
	//we will get RE: NumberFormatException
		
		//Integer io4 = Integer.valueOf("a"); 
		//Integer io5 = Integer.valueOf("@"); 
		//Integer io6 = Integer.valueOf("10.5"); 
		//Integer io7 = Integer.valueOf("true");
		
		Double 	  do4 = Double.valueOf("5");
		Double 	  do5 = Double.valueOf("5.0");
		Double 	  do6 = Double.valueOf("5F");
		Double 	  do7 = Double.valueOf("5D");
		//Double  do8 = Double.valueOf("5L");
		//Long 	  lo4 = Long.valueOf("5L");
		Long 	  lo5 = Long.valueOf("12345678901");
		//Long 	  lo6 = Long.valueOf("12345678901L");
		//Integer  io8 = Integer.valueOf("12345678901");
 //=================================================================
		//The need of this conversion is for reading data from kb
		//every data reading from KB is returned as String type
		//for converting  PV from String to WC and to PV we need this conversion
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nEnter Integer value: ");
		String 	s1 	= br.readLine(); 		//"50"
		Integer io3 = Integer.valueOf(s1); 	//I(50)
		int 	i3 	= io3.intValue();		//50
		System.out.println(i3);
		
		System.out.print("Enter Double value: ");
		String 	s2 	= br.readLine(); 		//"50.0"
		Double 	do3 = Double.valueOf(s2); 	//D(50.0)
		double 	d3 	= do3.doubleValue();	//50.0
		System.out.println(d3);

	}
}
