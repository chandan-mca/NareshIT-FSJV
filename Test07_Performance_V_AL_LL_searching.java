
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test07_Performance_V_AL_LL_searching {
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
			v1.contains(30000);  //linear searching algorithm
		time2 = System.currentTimeMillis();
		System.out.println("V  searching time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
			al.contains(30000);	//linear searching algorithm
		time2 = System.currentTimeMillis();
		System.out.println("al searching time: "+ (time2-time1));

		time1 = System.currentTimeMillis();
			ll.contains(30000);	//linear searching algorithm
		time2 = System.currentTimeMillis();
		System.out.println("ll searching time: "+ (time2-time1));
		
	}
}
