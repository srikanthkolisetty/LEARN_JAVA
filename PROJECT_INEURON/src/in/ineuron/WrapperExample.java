package in.ineuron;

public class WrapperExample {

	
	public void m1(long l)
	{
		
	}
	public void m1(Number f)
	{
		System.out.println("k");
	}
	public static void main(String[] args) {
		WrapperExample d=new WrapperExample();
		d.m1(12); // first primitive type promotion if not then type base autoboxing and after autoboxing , performs widening on that.
		
	}
}

