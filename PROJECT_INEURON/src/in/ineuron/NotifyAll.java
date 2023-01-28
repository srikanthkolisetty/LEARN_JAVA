package in.ineuron;


class Stop
{
	public synchronized void shiva()
	{
		System.out.println("in sync");
		this.notify(); // notifies only one thread, which  thread will be decided thread scheduler 
		this.notifyAll(); // notifies all threads 
	}
}

// when we use notify() out of many waiting threads only one thread gets executed.

public class NotifyAll {

	static Stop s=new Stop();
	public static void main(String[] args) throws Exception{
	
		Thread d= new Thread(()->
		{System.out.println("first");
			synchronized(s)
			{
				try {
					s.wait();
					System.out.println("after wait in first");
				}
				catch(Exception e) {}
				
			}
		
		});
		Thread d1= new Thread(()->
		{System.out.println("second");
			synchronized(s)
			{
				try {s.wait();
				System.out.println("after wait in second");}
				catch(Exception e) {}
				
			}
		
		});
		d.start();
		d1.start();
		Thread.sleep(2000);
		s.shiva();
	}
}
