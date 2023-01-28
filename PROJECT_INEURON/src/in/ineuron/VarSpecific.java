package in.ineuron;

public class VarSpecific {
	
	
	public void m2(int []a)
	{
		System.out.println("in");
	}
	
	public void m2(int ...x)
	{
		System.out.println("in");
	}

	
/*
 * Above gives error because int ...x will be treated as int[]x and as there is anotheer method which accepts the 
 * array it gives error. No method overloading happens because of same type and both are array only.
 * 
 * 
 */
	
	
}
