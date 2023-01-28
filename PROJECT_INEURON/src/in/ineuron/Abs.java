package in.ineuron;

abstract class Ad
{
	public void u()
	{
		System.out.println("o");
	}
	public abstract void r(); // we need to write public abstract because we will not have all methods as abstract
}
public class Abs extends Ad{

	public void r()
	{
		System.out.println("r");
	}
	
public static void main(String[] args) {
	
	Abs l= new Abs();
	l.u();
	Integer a=1;
	int i=a.intValue();
	String d= "lls";
}
	
}
