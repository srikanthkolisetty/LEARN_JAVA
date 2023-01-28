package in.ineuron;

class MyThread extends Thread
{
	MyThread()
	{
		
	}
	MyThread(Runnable r)
	{
		super(r);
	}
	public void run()
	{
		System.out.println("inside thread");
	}
}

class RunnableDemo implements Runnable
{
	public void run()
	{
		System.out.println("inside the runnable");
	}
}
public class SnippetThread {

	public static void main(String[] args) {
		
		new MyThread().start();
		new MyThread(new RunnableDemo()).start();
		// inside thread inside thread 
	}
}
