package in.ineuron;

class CCC
{
	public void m2()
	{
		System.out.println("k");
	}
}
interface AAA{
	public static void m1()
	{
		System.out.println("hi");
	}
	default public void m2()
	{
		final int a=10; 
		// inside a method we can't use public,private modifiers.
		System.out.println("hiw");
	}
}

@FunctionalInterface
interface BBB
{
	public void m3();
	default public void m2()
	{
		System.out.println("hi");
	}
}
public class StaticInInterface extends CCC implements AAA,BBB{

	public static void main(String[] args) {
		AAA.m1();
		StaticInInterface s= new StaticInInterface();
		s.m2();
		BBB b=()->{System.out.println("ss");};
		b.m3();
	}
	
	@Override
	public void m2()
	{ 
		
		//option1 : we should provide our own implementation 
		System.out.println("hi");
		//option2 : make a call to particular default method using interfacename.super.methodname
	// should do either of one option.
	}
	

	
	
}
