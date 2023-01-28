package in.ineuron;
import java.util.PriorityQueue;
public class PriorityQueuee {

	public static void main(String[] args) {
		
		Byte a=20;
		PriorityQueue u=new PriorityQueue();
		u.add(12);
		u.add(12); // duplicates are allowed.
		u.add(10);
		u.add(100);
		u.add(1);
		//u.add(a); this also gives exception
	//	u.add(10.98); it gives class cast exxception
	//	u.add(null);// this gives excpeption
		System.out.println(u);
	// index based accessing not allowed here.
		for(Object g:u)
			System.out.println(g);
	}
}
