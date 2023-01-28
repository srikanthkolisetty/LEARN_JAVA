package in.ineuron;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
public class Fail{
	static ArrayList<Integer> d;
	public static void main(String[] args) throws Exception{

		d = new ArrayList<Integer>();
		// the type of arraylist should be specified in object type. 
		d.add(10);
		d.add(20);
		
		Iterator r =d.iterator();
//	
//		Thread f= new Thread(
//				()->{
//						Fail.d.add(100);
//				});
//		f.start();
//		while(r.hasNext())
//		{
//			System.out.println(r.next());
//			
//			Thread.sleep(2000);
//		}
		// The code upto above causes the ConcurrentModificationException, this is called as fail fast
		
		CopyOnWriteArrayList c= new CopyOnWriteArrayList();
		c.add(12);
		c.add(122);
		c.add(13);
		Iterator u=c.iterator();
		while(u.hasNext())
		{
			System.out.println(u.next());
			c.add(181);
		}
		System.out.println("end");
		/*
		 * 
		 * From above code i.e from line 29 to 39 it is example for fail safe 
		 * i.e data entering will be stoped but no exception will be raised
		 * since no exception will be raised the program will be executed normally.
		 */
		System.out.println(Collections.frequency(c, 12));
		Collections.shuffle(c); // it changes the position of the elements
	}

}
