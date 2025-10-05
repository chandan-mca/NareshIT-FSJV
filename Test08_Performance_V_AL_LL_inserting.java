
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test08_Performance_V_AL_LL_inserting {
	public static void main(String[] args) {
		Vector<Integer> 	v1 = new Vector<Integer>();
		ArrayList<Integer> 	al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=1; i<=1000000; i++) {
			v1.add(new Integer(i));
			al.add(new Integer(i));
			ll.add(new Integer(i));
		}
		
		

		long time1, time2;

		time1 = System.currentTimeMillis();
			//v1.add(0,30000);
			//v1.add(20000,30000);
			v1.add(600000,30000);
		time2 = System.currentTimeMillis();
		System.out.println("V  inserting time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
			//al.add(0,30000);
			//al.add(20000,30000);
			al.add(600000,30000);
		time2 = System.currentTimeMillis();
		System.out.println("al inserting time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
			//ll.add(0,30000);
			//ll.add(20000,30000);
			ll.add(600000,30000);
		time2 = System.currentTimeMillis();
		System.out.println("ll inserting time: "+ (time2-time1));
		
	}
}
