package in.ineuron;

interface INew
{
	void one();
	default void two()
	{
		System.out.println("default method");
		four();
	}
	// default methods can be inherited and can also be overriden.
	static void three()
	{
		System.out.println("static method");
	}
	//interface static methods are not inherited 
	private void four()
	{
		System.out.println("inside the four method");
	}
	// in new versions of java, interface can have private methods
}

public class JavaInterfaces implements INew{
	
	public void one() {
		System.out.println("one");
	}
public static void main(String[] args) {
		
	new JavaInterfaces().two();
}
}
