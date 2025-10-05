
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test06_Performance_V_AL_LL_retrieve {
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
		for(int i=0; i<1000000; i++) {
			v1.get(i);
		}
		time2 = System.currentTimeMillis();
		System.out.println("V  retrieving time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			al.get(i);
		}
		time2 = System.currentTimeMillis();
		System.out.println("al retrieving time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			ll.get(i);
		}
		time2 = System.currentTimeMillis();
		System.out.println("ll retrieving time: "+ (time2-time1));
		
	}
}
