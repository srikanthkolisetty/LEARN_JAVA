package in.ineuron;

interface Trade
{
	void m1();
	void m2();
}

//Important example below one.
public class ImplementingInterfaceType1 implements Trade {

	byte w=90;
	public void m2() {
	}
	public static void main(String[] args) {
		
		
		
		Trade t= new Trade() // this is implementation for anonymous class.
				{
					
			static final int a=10; // anonymous inner class variable only constants and instance,local allowed 
			int b=19;
					@Override
					public void m1()
					{
						System.out.println("m1");
					}
					public void m2()
					{
						int t=19;
						System.out.println("m2");
					}
					public void m3()
					{
						System.out.println("anonymous inner class specific method not related to interface");
					}
			
				};
	
				t.m1();
				System.out.println();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}
