package in.ineuron;
@FunctionalInterface
interface IFunc
{
	void fu(int a,int b);
}

interface ISample
{
	default void onee()  // the access specifier for this is public by default 
	{
		two();
	}
	static void two()
	{
		System.out.println("hi srikanth");
	}
	// static methods will not be inherited so that only for two() method written in class
	// compiler is not giving error otherwise 
}





public class Functional implements ISample{
	static void one()
	{
		System.out.println("hi");
	}
	void two()
	{
		one();
	} // here we are not overriding the static two method here it is specialized method 
	// static methods of interface are not inherited as they are not inheritted then there is no concept of overriding only.
	

	public static void main(String[] args) {
		
		IFunc c=(a,b)->{
			System.out.println(a);
			System.out.println(b);
		};
		new Functional().two();
		// when two parameters are there it is must to specify the paranthesis but no need to specify data type.
		
		new Functional().onee();
	}
}
