package in.ineuron;
import java.util.LinkedList;
public class LinkedListt {

	public static void main(String[] args) {
		
		// this collection uses doubly linked list data structure internally
		//shifting operation is not time consuming here
		LinkedList l= new LinkedList();
		l.add(10);
		l.addFirst(20);
		l.addLast(30);
		l.add(1,90);
		LinkedList b= new LinkedList();
		l.addAll(b); // when b is empty nothing will be added , empty list also not added 
		System.out.println(l);
		b.add(50);
		l.addAll(2,b); // adding another collection at particular index
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(3));
		System.out.println(l.offerFirst(100)); // return type is boolean
		System.out.println(l);
		System.out.println(l.poll()); // gives the first element and removes it linkedlist.
		System.out.println(l);
		l.pop();
		System.out.println(l); // removes the first element.
		l.removeFirstOccurrence(90);
		System.out.println(l);
		l.add(null);
		l.set(2, 100);
		System.out.println(l);
	}
}
