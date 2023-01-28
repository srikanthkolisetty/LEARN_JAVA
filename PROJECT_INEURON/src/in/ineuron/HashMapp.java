package in.ineuron;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapp {

	public static void main(String[] args) {
		
		HashMap p= new HashMap();
		p.put(1,"shiva");
		p.put(3,"parvathi");
		p.put(2,"srikanth");
		System.out.println(p.get(1)); // accessing elements
		p.put(2,"ganesh");
		System.out.println(p.get(2)); // no duplicate keys allowed but duplicate vallues allowed
		System.out.println(p); // order of insertion is not preserved
		LinkedHashMap h= new LinkedHashMap();
		h.put(5,"shiva");
		h.put(6,"shiva");
		System.out.println(h); // order of inseriton is maintained
		// both key value together is stored as entry type data
		System.out.println(h.get(100));
	// Now to access the elemnts we can't use iterator as we have used on the collection classes
	// Here to make use of the iterator we should make use of some methods and then work on them
		
		java.util.Collection r= p.values();
		
		java.util.Iterator q= r.iterator();
		while(q.hasNext())	System.out.println(q.next());
		// the above is one way but we get only values
		java.util.Set l= p.keySet();
		java.util.Iterator y= l.iterator();
		while(y.hasNext())	System.out.println(y.next());
		// the above is one way but we get only keys.
	 java.util.Set w= p.entrySet(); // totally set will return but the data type of inside records can be casted to entry
		
	// we cannot use iterator directly on hashmap or on map
	//In the hashmap the record data type is entry only.
	 java.util.Iterator m=w.iterator();
	 while(m.hasNext())
	 {
		java.util.Map.Entry i=(Entry)m.next();
		System.out.println(i.getKey());
		System.out.println(i.getValue());
		
	 }
		
	}
}
