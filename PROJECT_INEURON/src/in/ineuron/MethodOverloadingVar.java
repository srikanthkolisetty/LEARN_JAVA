package in.ineuron;
public class MethodOverloadingVar {

	public void m1(int ...x)
	{
		System.out.println("var args method");
	}
	public void m1(int x)
	{
		System.out.println("single primitive method");
	}
	public void m1(Integer x)
	{
		System.out.println("single wrapper");
	}
	public void m1(long x)
	{
      System.out.println("single but long type promoting ");
		
	}
	public static void main(String[] args) {
		
		MethodOverloadingVar d=new MethodOverloadingVar();
		d.m1(2); // m1(int x) will be called but if this is not there then m1(long x) will be called
		/*
		 * 
		 * first compiler gives preference to primitive type type casting only 
		 * if primitive type not there then wrapper and at last var args 
		 * var args is given the last preference only.
		 * 
		 * 
		 * 
		 */
	}
}
