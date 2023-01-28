package in.ineuron;

class Onee
{
public synchronized void me(Twoo h) throws Exception
{
	System.out.println("Inside me");
	Thread.sleep(2000);
	h.last();
}
public synchronized void last()
{
	System.out.println("in last");
}
	
}

class Twoo
{
	public synchronized void me(Onee h) throws Exception
	{
		System.out.println("Inside me");
		Thread.sleep(2000);
		h.last();
	}
	public synchronized void last()
	{
		System.out.println("last");
	}
	
}




//runnable is functional interface.

public class Dead {
	
	static Onee e=new Onee();
	static Twoo t=new Twoo();
	
	public static void main(String[] args){
		
		//calling the parameterized constructor of thread that acceptes runnable type. 
		Thread d= new Thread(()->
		{
			try {
				e.me(t);
			}
			catch(Exception e) // here we should write Exception e only not InterruptedException e because in above we are throwing Exception e
			{
				
			} 
		});
		Thread d1= new Thread(()->
		{
			try {
				t.me(e);
			}
			catch(Exception e) // here we should write Exception e only not InterruptedException e because in above we are throwing Exception e
			{
				
			} 
		});
		
		d.start();
		d1.start();
		System.out.println(Thread.currentThread().getName());
	}
	/*
	 * The above is a dead lock where one thread waits to execute last() method of other class 
	 * and another method waits execute the last() method of the other class.
	 * 
	 */
}

