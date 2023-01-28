package in.ineuron;

interface You
{	
	static final int a=10;
}
class ThreadMethods extends Thread
{
	public void run() // we cannot use throws keyword for checked exception because the same method in base class has no throws keyword in signature.
	{
		System.out.println("run method");
		for(int i=0;i<3;i++)
		{
			try 
			{
				Thread.sleep(1000);	
				Thread.yield();
			}
			catch(InterruptedException e) // when we are specifying checked exception in catch and if there is no such statement that compiler finds in try block then it gives error only for checked exceptions
			{
				
			}
			System.out.println("sub thread"+Thread.currentThread().getName());
		}
	}
	// can use throws if the exception is runtime 
	//Exception class is a partially checked exception
}

class Two implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
			System.out.println("run runnable");
	}
}

public class Threa{
	
	static final int a; // stati final variable can also be initialize inside static block.
	static
	{
		a=10;
	}
	
	public static void main(String[] args) throws Exception{
	
		ThreadMethods s= new ThreadMethods();
		s.start();
		Two r=new Two();
		Thread f= new Thread(r);
		f.start();
		s.join();// not specifying any time if we want to specify time we call the param method
		System.out.println("main thread");
		
	}
	
	// there is no gaurantee that the thread which is in waiting state or sleeping state will get executed immediately.i.e it go's to runnable/ready state
	// and then when the thread scheduler gives the chance again then it go's to running state.
}
