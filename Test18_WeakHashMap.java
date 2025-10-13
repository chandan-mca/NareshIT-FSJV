import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * - HashMap maintains entries with strong reference. 
 *    It means even though key objects does not have external references
 *    garbage collector cannot remove entries from the HashMap instance 
 *    
 * - Whereas WeakHashMap maintains entries with weak reference. 
 *    It means when key objects does not have external reference or 
 *    does not refer from the pool garbage collector removes entries 
 *    from the WeakHashMap instance 
 *    
 * - WHM is an implementation from Map interface it is available from Java 1.2v
 *   When we want to store entries with weak references, we must use WeakHashMap  
 *    
 */
public class Test18_WeakHashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		
		hm.put(new String("a"), 5);
		hm.put(new Integer(97), 6);
		System.out.println(hm);
		
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(hm);
		
		whm.put(new String("a"), 7);
		whm.put(new Integer(97), 8);
		
		String s2 = new String("b");	
		whm.put(s2, 9);
		
		whm.put("c", 10);
		whm.put(15, 10);
		
		System.out.println(whm);
		
		System.gc(); //requesting JVM to run garbage collector
		System.out.println(whm);
		
		
	}
}
