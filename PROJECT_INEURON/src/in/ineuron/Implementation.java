package in.ineuron;
interface one
{
	void one();
}
interface two
{
	void one();
}

// if the method is having same return type and same signature then we can implement two interfaces simultaneously.
public class Implementation implements one,two{
	
	public void one()
	{
		System.out.println("hi");
	}
public static void main(String[] args) {
	
	int a =1;
	
}
}
