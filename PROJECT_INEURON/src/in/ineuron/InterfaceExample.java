package in.ineuron;

@FunctionalInterface
interface LambdaExpressionn
{
	void m6();
	default public void m4()
	{
		System.out.println("hi");
	}
	public static void m7()
	{
		System.out.println("hi hero");
	}
}

public class InterfaceExample implements LambdaExpressionn{

	static void m9()
	{
		System.out.println("in");
	}
	public void m6()
	{
		System.out.println("in the class");
	}
	public static void main(String[] args) {
		
		LambdaExpressionn d=()->{
			System.out.println("inside the d");
		};
		d.m4();
		d.m6();
		LambdaExpressionn.m7();
		// with lambda expression reference we can also access the default methods
		new InterfaceExample().m4();
		
		new InterfaceExample().m6();
		
	}
}
