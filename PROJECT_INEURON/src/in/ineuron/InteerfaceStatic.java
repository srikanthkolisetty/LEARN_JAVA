package in.ineuron;

interface IStaticBlock
{
	int a;
	
//	IStaticBlock(int a )
//	{
//		this.a=a;
//	} // interfaces cannot have constructors where abstract class have constructor.
}


public class InteerfaceStatic {
	
	final int b;
	float n=10.0f;
	static int a;
	//final static int d; this line gives error because when the variable is declared as static and final then value should be given at the time of declaration only.
	InteerfaceStatic(int b,int a)
	{
		this.b=b; // because static variables can be accessed by object also
	}
	
	public static void main(String ar[])
	{
		InteerfaceStatic i= new InteerfaceStatic(10);
		System.out.println(b);
		
	}
}
