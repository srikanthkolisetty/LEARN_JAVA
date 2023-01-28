package in.ineuron;

interface IA
{
	int a=10; // public static final will be placed by compiler by default.
	public static final int b=0; // why static means it should be available in static also because we can't create object for interface.
	void m1();
	public abstract void m2();
}
interface IV extends IA{
	void m3();
}
// an interface extends any number of interfaces but can't extends a class or implement interface
// a class can only extend one class and can implement multiple interfaces

abstract class CImpl implements IV{
	public void m1()
	{
		System.out.println("m1");
		System.out.println(a);
	}
	
}
public class Inter extends CImpl{
	//static int a=9;
	 final int b;  
	 Inter(int a)
	 {
		 b=a;
	 }
	 /*
	  * when we declare a variable as final at class level the value to it must be given either
	  * in constructor assignment or at the time of declaration only.
	  * Where as if we declare a variable as final in the method with out initializing the value
	  * it won't give any error but if we try to use it , it gives error i.e the value for it should be given before it is used
	  */
	public void m2() {
		
	}
	public void m3()
	{
		final int a;
		//a=3;
	}
	public static void main(String args[])
	{
		int a=9; // here it is local variable
		System.out.println(a); // local variable
		System.out.println(Inter.a); // interface variable as Inter class have no static variable with a it takes from inteerface.
		System.out.println(CImpl.a); 
		
		
	}
}
