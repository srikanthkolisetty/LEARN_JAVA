package in.ineuron;

class C
{
	C()
	{
		System.out.println("super");
	}
	C(int x)
	{
		System.out.println("super 2");
	}
}
public class Superrr extends C{

	Superrr(int x)
	{ // by default super() will be inserted here
		System.out.println("o");
	}
	public static void main(String[] args) {
		
		Superrr t= new Superrr(1);
		
	}
}
