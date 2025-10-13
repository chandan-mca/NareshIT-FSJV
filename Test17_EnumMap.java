/**
 * 1. The EnumMap is a collections framework collection, it available from Java 5v.
 *    It implementation of Map interface
 *    
 * 2. It used for mapping values for an enum named constants 
 *    either fixed value or dynamic values
 * 
 * 3. It is not a synchronized collection
 * 
 * 4. It is an ordered collection, maintains named constants declared order its enum
 * 
 * 5. Its implemented data structure is fixed length enum[] 
 * 
 * 6. Its capacity is equals to the given enum length
 * 
 * 7. It allows 
 * 		as keys 	-> only one enum named constants
 * 		as values 	-> all 4 types of objects
 * 
 * 8. as key null is not allowed
 * 	  as values null is allowed, multiple nulls
 * 
 * 9. It stores entries in named constants declared order
 * 
 * 10. It allows us to retrieve 
 * 		keys 	only sequentially and 
 * 		values 	sequentially and randomly
 * 
 * 11. In adding, searching, retrieving and removing operations 
 *     inside put(), containsKey(), get() and remove() methods 
 *     equals() method is called 
 *     
 * 12. The available constructors are    
 *		1. EnumMap(Class c) 		
 *		2. EnumMap(Map m) 		
 *		3. EnumMap(EnumMap em)
 * 		
 */
import java.util.EnumMap;

enum LunchItem { 
	RICE, BIRYANI, PARATA, CHAPATHI	
}

public class Test17_EnumMap {
	public static void main(String[] args) {
		
		EnumMap<LunchItem, Integer> em = new EnumMap<>(LunchItem.class);
		em.put(LunchItem.BIRYANI, 120);
		em.put(LunchItem.CHAPATHI, 50);
		em.put(LunchItem.PARATA, 35);
		em.put(LunchItem.RICE, 150);
		System.out.println(em);
		
		System.out.println(LunchItem.BIRYANI + " price: " + em.get(LunchItem.BIRYANI));
		System.out.println(LunchItem.PARATA  + " price: " + em.get(LunchItem.PARATA));
	}
}
