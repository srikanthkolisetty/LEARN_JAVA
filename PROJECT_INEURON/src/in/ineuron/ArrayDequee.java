package in.ineuron;

import java.util.ArrayDeque;
public class ArrayDequee {
	
	
	static int[]a;
	public static void main(String[] args) {
		
//		System.out.println(a.length);
		
		ArrayDeque d= new ArrayDeque();
		// it internally makes use of double ended queue.
		//it implements deque interface
		d.add(10);
		d.add(12);
		d.addFirst(90);
		d.addFirst(90);
		d.addLast(2);
		d.getFirst();
		d.getLast();
		d.add("srikanth"); // it can store different data
		//d.add(null); // null can't be stored in arraydeque gives exception
		//some collections can store null and some will not store
		
		//duplicates are allowed 
		d.pop();
		System.out.println(d);
		for(Object o:d)
			System.out.println(o);
		
		
	}
}
interface f
{
	void f();
}
abstract class g implements f
{
	
}
