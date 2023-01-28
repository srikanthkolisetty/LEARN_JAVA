package in.ineuron;
import java.util.ArrayList;
import java.util.Iterator;
public class Genericsc {
	public static void main(String[] args) {
		
		ArrayList<Integer>a = new ArrayList();
		// generics are last upto compile time only
		a.add(0);
		//a.add("Sdd"); gives error
		new Genericsc().m1(a);
	Iterator r=a.iterator();
	while(r.hasNext())
	{
		System.out.println(r.next());
	}
	}
	void m1(ArrayList a)
	{
		a.add("Shiva"); // here no problem we can add other type 
		// this is called as generic comprimisation.
		// here we passed array list is of type integer generic but able to add other type also.
		
	}

}
