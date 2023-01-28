package in.ineuron;

class Newe extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		System.out.println("new thread");
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		
		Newe n= new Newe();
		n.start();
		for(int i=0;i<5;i++)
			System.out.println("main thread");
	}

}
/*
 * 
 * start method creates a new thread and registers with thread schedulers
 * perform all low level activities 
 * and calls the run method().
 * If run method is not overriden then parent class i.e Thread class run method will be invoked.
 */
