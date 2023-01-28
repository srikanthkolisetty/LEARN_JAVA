package in.ineuron;

class Super
{
	public void m(int a)
	{
		System.out.println(a);
	}
}

public class Overriding extends Super{

	
	public void m(int a) {
		// TODO Auto-generated method stub
		super.m(a);
	}

//	public void m() {
//		// TODO Auto-generated method stub
//	}
	// when we override a method the no of parameters should be same and return type also should be same. other wise results to overloading.
	
	
	
	

}
