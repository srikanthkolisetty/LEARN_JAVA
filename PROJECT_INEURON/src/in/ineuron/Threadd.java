package in.ineuron;

class BB extends Thread
{
	
	public void run() 
	{
		new CC().m2();
	}
}
class CC
{
	void m2()
	{
		synchronized(this)
		{
			System.out.println("hi");
			System.out.println("hi");
			
			try{Thread.sleep(9000);}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("hj");
			//this.notify();
		}
	}
}

public class Threadd {

	public static void main(String[] args) throws InterruptedException{
		
		BB b=new BB();
		b.start();
		CC c= new CC();
		synchronized(c) // here if we use b
		{
			Thread.sleep(5000);
			System.out.println("in main");
			c.wait(); // here if we use b.wait() and place the m2() method code inside run method then the thread which is in waiting state will run even notify is called.
			//that is because if we use b then the thread instance and wait() methods are called on same and even if we not called notify the thread before its dying calls the notify() method on its thread instance.
			System.out.println("two main");
		}
	}
}
