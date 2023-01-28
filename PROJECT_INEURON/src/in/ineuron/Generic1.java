package in.ineuron;

import java.util.ArrayList;

class Dream <T>  // T is type parameter. it can be either unbounded or upper bounded
{
	public void add(T a) 
	{
		System.out.println(a);
	}
}//class level type parameter

class DreamShiva
{
	public <T> void met(T a,T b,ArrayList<?> al)
	{
		// al.add("srika"); this line gives error because we have used wild card generic pattern
		//When we have used wild card generic type then the data type is any 
		//Suppose if the received arraylist is of integer type then inside method we can't perform add of string data
		//These are the problems with ? generic so for which compiler allows only to read 
		System.out.println(a.getClass());
		a=(T)"as";
		System.out.println(a.getClass());
	}
}

// wild card generic is mostly used for read operations.

public class Generic1 {
	public static void main(String[] args) {
		
		
		//generics can be applied at three levels
		//class level
		//method level
		//parameter level
		//for type parameter we can use only class names no primitive types allowed.
		Dream<Integer> d= new Dream();
		d.add(10);
		//d.add("sd"); this line gives error.\
		DreamShiva q= new DreamShiva();
		q.met(10,10.8,new ArrayList());
		Object s=(Object)"s"; // here "s" is a string object 
		System.out.println(s.getClass());
		Object f=(Number)10;
		System.out.println(f.getClass());
		
	}

}
