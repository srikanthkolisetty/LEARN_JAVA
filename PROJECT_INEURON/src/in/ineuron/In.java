package in.ineuron;

class D{
	int a=0;
}

public class In extends D {
	
	public void m()
	{
		System.out.println(a); // parent class a 
	}
	
	public static void main(String args[])
	{
		In n=new In();
		System.out.println(n.a); // since it is static we need to use object to use it.
		
	}
}
