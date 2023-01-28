package in.ineuron;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListt {
public static void main(String[] args) {
	
	ArrayList a= new ArrayList();
	//arraylist can store both homogeneous and heterogeneous type of data
	System.out.println(a);
	a.add(10);
	a.add("shiva");
	a.add(30.0);
	// data is stored as objects i.e auto boxing happens
	ArrayList a1= new ArrayList();
	a1.addAll(a);//copy entire arraylist into another arraylist
	System.out.println(a.contains(10));
	System.out.println(a.indexOf("shiva"));
	System.out.println(a.indexOf(40));
	System.out.println(a.size());
	a.ensureCapacity(10);
	a.trimToSize();// trims the capacity of array list to its current size
	a.clear();
	System.out.println(a.isEmpty());
	System.out.println(a.containsAll(a1));
	a.add(a1); // adding a list it's like append method in python
	System.out.println(a);
	System.out.println(a.get(0)); // used to access the element 
	a.remove(0); // here it takes index
	System.out.println(a);
	a.add(10);
	System.out.println(a);
	Integer i=10;
	a.remove(i); // remove is also overloaded method ,here it takes object 
	System.out.println(a);
	a.addAll(a1);
	System.out.println(a); // its like extend() method in python
	
	Object b[]=a.toArray(); // returns the array.
	System.out.println(b);
	a.add(2,20); //adding element based on index
	a.removeAll(a1); // removes the elements present in the a1 list.
	System.out.println(a);
	a.add(10);
	a.set(0,30); // used to set element at certain index.
	a.add(null); // arraylist can store null 
	System.out.println(a);
	
	//List based ones can be accessed by using indexes
	for(int j=0;j<a.size();j++)
		System.out.println(a.get(j));
	//Now we can use an iterator through which we can iterate on collections
	Iterator it=a.iterator();
	// when we call the a.iterator() then an iterator will be created which will pointing to the list just like a cursor 
	//iterator is also present in the java.util package
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	//Now if we want to iterate in a reverse direction then such kind of iteration is possible only in list based classes.
	ListIterator it2=a.listIterator();
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
	// the above list iterator also iterates from starting but as we need from last to first inorder to get the expected behaviour we pass the index from where it should start.

	ListIterator it3= a.listIterator(a.size());
	System.out.println("reverse");
	while(it3.hasPrevious())
	{
		System.out.println(it3.previous());
	}

}
}
