package in.ineuron;

class Superr
{
	public void one()
	{
		System.out.println("one");
	}
	
}

class Superr2
{
	public void one()
	{
		System.out.println("second one");
	}
}


public class Anonymous2 extends Superr{
 
	public void one()
	{
		System.out.println("over Superr1");
	}
	public static void main(String[] args) {
		
		int []f= {1,2,3};
		// f[4]=1; run time error or exception 
		int []y=new int['a'];
		int []p= new int[]{1,2,3};
		Anonymous2 a= new Anonymous2();
		Superr2 s=new Superr2() {
			//static int aaa; static block and static variables are not allowed.
			public void one()
			{
				System.out.println("over Superr2");
			}
		};
		a.one();
		s.one();
	}
}
// Anonymous inner class can either extend or implement but not both at a time.We can also write some specialized methods in it.But we can't declare static block,variables
//The anonymous inner class can have access to the local variables of the class where it is defined.
