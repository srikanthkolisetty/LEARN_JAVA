package in.ineuron;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ListIterator;
class Supportt implements Comparable
{
	int id;
	String name;
	int team_size;
	public Supportt(int id,String name,int team_size)
	{
		this.id=id;
		this.name=name;
		this.team_size=team_size;
		
	}
	
	public int compareTo(Object o1)
	{
		Supportt s1=(Supportt)o1;
		if(this.id>s1.id)
		{
			return 1;
		}
		else if(this.id<s1.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		return name+" "+team_size+" "+id;
	}
}

class ComparisonName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Supportt s1=(Supportt)o1;
		Supportt s2=(Supportt)o2;
		
		
		return s1.name.compareTo(s2.name); // compareTo() method is implemented by String class
		// return -s1.name.compareTo(s2.name); descending order
		// return s2.name.compareTo(s1.name); descending order
		// return -s2.name.comparTo(s1.name); ascending order
		// return 1 insertion order
		// return -1 reverse of insertion order
	}
	
}
//All wrapper classes by default implement Comparable interface.


public class Sortingg {

	public static void main(String[] args) {
		
		TreeSet s= new TreeSet(new ComparisonName());
		s.add(new Supportt(1,"one",5));
		s.add(new Supportt(2,"two",4));
		s.add(new Supportt(3,"three",6));
		s.add(new Supportt(6,"six",9));
		
		Iterator r=s.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		ArrayList<Supportt> a = new ArrayList();
		a.add(new Supportt(1,"xne",5));
		a.add(new Supportt(2,"two",4));
		Collections.sort(a, new ComparisonName());
		ListIterator<Supportt> l=a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
}
//this is how we make use of Comparable and Comparator interface.