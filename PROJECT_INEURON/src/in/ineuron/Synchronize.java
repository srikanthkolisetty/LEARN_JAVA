package in.ineuron;

class Mee
{
	static final int a;
	static
	{
		a=20;
	}
	
	
	
	
	public static synchronized void edit()//class level lock
	{
		for(int i=0;i<5;i++)
		{	try {
			Thread.sleep(2000);
			System.out.println(i);
		
		}
		catch(InterruptedException e)
		{
			System.out.println("inside exception");
		}
			}
	}
	public static synchronized void edit2()
	{
		System.out.println("second");
	}
	
	public static void edit3()
	{
		Integer x=10;
		System.out.println("hello ");
		synchronized(x)
		{
			for(int i=0;i<3;i++) System.out.println("block lock");
		}
	}
	
	public synchronized void f()
	{
		try {
			Thread.sleep(2000);	
			System.out.println("object lock");
		}
		catch(InterruptedException e)
		{
			System.out.println("inside exception");
	
		}
	}
	
	
}


public class Synchronize {
 
	public static void main(String[] args) {

		Mee e= new Mee();
		Thread g= new Thread(()->{System.out.println("hi");
		
		new Mee().f();
		Mee.edit();
		Mee.edit3();});
		Thread h= new Thread(
				()->{
					System.out.println("hih");
					new Mee().f();
					Mee.edit3();
					Mee.edit2();// even this method to execute no class level lock should be lock is not based on method it is either on object or class level.
					Mee.edit();
					
				}
				);
				g.start();
				h.start();
	
	}
}
