package in.ineuron;

import java.util.TreeMap;
import java.util.WeakHashMap;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t=new TreeMap();
		t.putIfAbsent(12, "twelve");
		System.out.println(t);
		Integer i= new Integer(23);
		WeakHashMap<String, Integer> w = new WeakHashMap();
		w.put("int", i);
		i=null;
		System.out.println(w);
		WeakHashMap<Integer, String >w1= new WeakHashMap();
		w1.put(i, "one");
		System.out.println(w1);
		w1.put(null,"null");
		
	}
}
