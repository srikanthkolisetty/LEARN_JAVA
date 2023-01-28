package in.ineuron;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.TreeSet;
import java.util.Iterator;
public class Collectionss {

	public static void main(String[] args) {
		
		ArrayList t= new ArrayList();
		t.add("shiva");
		t.add(10);
//		Collections.sort(t); // this will work only if we have same data type data.
		System.out.println(t);
		// Now if we are having different data type then we should make use of comparator.
		
		LinkedList t1= new LinkedList();
		t1.add(120);
		t1.add("shiva");
		t1.add(212);
		t1.add(10.9);
		Iterator i= t1.descendingIterator();
		/*
		 * Descending iterator will by default iterates in descendng order.
		 * The return type of descending iterator is Iterator.
		 * Descending iterator is supported by LinkedList,ArrayDeque,TreeSet
		 */
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
