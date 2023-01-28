package in.ineuron;


class Base
{
	Base()
	{
		System.out.println("in the base "+this);
	}
}

public class NumberOfObjects extends Base{

	public NumberOfObjects()
	{
		System.out.println("in the child"+this);
	}
	public static void main(String[] args) {
		
		NumberOfObjects n= new NumberOfObjects();
		System.out.println("child class");
	}
	/*
	 * Although the parent class constructor gets called only one object gets created.
	 * No two objects gets created.Parent class constructor is being called 
	 * only to get the properties.
	 */
}
