package in.ineuron;

@FunctionalInterface
interface inte
{
	void m2();
	default void me()
	{
		System.out.println("me");
	}
}
interface rt
{
	
}

public class Static {
	
	static int a;
	public static void main(String[] args) {
		
		Static v=new Static();
		Static g=new Static();
		v.a=10; // even if we change the static variable value using object it changes for every object.
		System.out.println(v.a);
		System.out.println(g.a);
		System.out.println(a);
	}

}
