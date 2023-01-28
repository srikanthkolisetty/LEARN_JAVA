package in.ineuron;
import java.util.HashMap;
import java.util.WeakHashMap;
public class WeekHashMapp{
	
	public void finalize()
	{
		System.out.println("finalize method-will be called only when there is use");
	}
	
	public static void main(String[] args) {
		
		WeekHashMapp p= new WeekHashMapp(); // our user defined class object
		WeakHashMap u= new WeakHashMap();
		u.put(p,"shica");
		p=null;
		System.gc();
		u.get(p);
		System.out.println("k");
		System.out.println(u.get(p));
/*
 * The only difference between hashmap and weekhashmap is i.e in the hashmap if the object which is 
 * specified as key doesn't contain any reference  then also it will not be eligible for garbage collector.
 * 
 * But for weakhashmap , if the object is specified as key doen't contain any reference it is eligible
 *for garbage collection.
 *This is the only difference between the hashmap and weakhashmap.
 * 
 */
		
	}

}
