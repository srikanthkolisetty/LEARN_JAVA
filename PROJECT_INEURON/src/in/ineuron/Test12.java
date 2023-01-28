package in.ineuron;

class People
{
	final String country = "India";  
	
	final public void xyz()
	{
		
		System.out.println("in xyz");
	}
	
	
	
}

class Plane{
	
	public void working(Plane p) // this method can work for many planes 1:M runtime polymorphism
	{
		p.test();
	}
	public void test()
	{
		System.out.println("plane test");
	}
}

class Indigo extends Plane
{
	public void test()
	{
		System.out.print("hi");
		System.out.println("working indigo"); // println prints and takes cursor to next line
	}
}

class Tata extends Plane
{
	public void test()
	{
		System.out.println("working tata");
	}	
}

// we can't extend a class if it is final  
public class Test12 extends People{

//	public void xyz()
//	{
//		
//	}
//	overriding a final method is not possible we can just invoke it.
	
	int d=9;
	public static void main(String[] args) {
		 StringBuilder s= new StringBuilder(null); // no compile time error but give exceeption because at runtime internally jvm tries to find length of the value but we can't operate on null data so it gives nullpointer exception
		Tata t= new Tata();
		t.working(new Indigo());
		StringBuilder s= new StringBuilder(10);  // initialize the capacity
		System.out.println(s.capacity());
			String s1="";
			System.out.println(s1.equals(null)); // empty object is not same as null. 	
		
	}

}
// runtime polymorphism helps to acheive loose coupling.