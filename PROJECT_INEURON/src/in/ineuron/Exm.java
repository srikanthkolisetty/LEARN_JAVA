package in.ineuron;


interface y
{
	void  m1();
}

interface y2 extends y
{
	void m1(); // this appears to overriding of m1() method.
}

@FunctionalInterface
interface o{
	void m3(); // by default it is public abstract
	default void m4() // it is public
	{
		System.out.println("m4");
	}
}
interface v 
{
	default void n3()
	{
		System.out.println("n3");
	}
}
@FunctionalInterface
interface r extends v
{
	void m4();
	default void n3() //overrides 
	{
		System.out.println("k");
	}
	
}




class PPP 
{
	static void m3()
	{
		System.out.println("in the ");
	}
}
public class Exm extends PPP{

	public static void main(String[] args) {
		 
		new Exm().m3();
		r i=()->{System.out.println("in");};
		i.n3();
	}// static methods are inheritted but can't be overriden.
}
