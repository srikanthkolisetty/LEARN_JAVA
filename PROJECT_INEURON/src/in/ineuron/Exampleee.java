package in.ineuron;

class Paa
{
	public static void three()
	{
		System.out.println("three");
	}
	
	public void four()
	{
		System.out.println("four");
	}
}
public class Exampleee extends Paa{

	public static void three()
	{
		System.out.println("threeee");
	} // static methods can't be overriden 
	// here this static method is treated as specialized method.
	// but if we change retun type we get error because now the Exampleee object 
	
	void four(int i)
	{
		
	}// overloading 
	public static void main(String[] args) {
		
		Paa a= new Exampleee(); // here with this type of object we can access overidden methods and Pa class methods.
		a.three();
		a.four();
		new Exampleee().three();
	}
}
