package in.ineuron;

public class Examplee {
	int a;  //instance variables can't be directly accessed inside staic methods
	static int b; // static variables can  be accessed any where 
	Examplee()
	{ 		System.out.println(b);

		System.out.println(a);

	}
	public void instance()
	{
		System.out.println(b);
	}
	public static void main(String args[])
	{
		Examplee e=new Examplee();
		int n;
		e.instance();
		
	}

}
