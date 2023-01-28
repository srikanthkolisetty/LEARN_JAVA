package in.ineuron;

enum Result
{
	ONE,TWO,THREE; // by default the constants are public static final
	/*
	 * For every constant internally object of type Result will be created .So here constructor will 
	 * be called three times.
	 * enum can have fields and also methods,constructors also
	 */
	Result()
	{
		System.out.println("inside the constructor");
	}
	// no public modifer should be used at constructor level
	void m1()
	{
		System.out.println("method m1");
	}
}

//Annotations are used to provide extra information to the compiler.


public class Annotations {
	
	public static void main(String[] args) {
		
		Result r= Result.ONE;
		System.out.println(r);
		r.m1();
		Result e[]=r.values();
		for(Result t:e)	System.out.println(t.ordinal());
	}

}
