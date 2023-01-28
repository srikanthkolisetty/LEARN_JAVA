package in.ineuron;


class Me extends Thread
{
	
	public void run()
	{
		System.out.println("run method");
	}
}
public class MultiThread2 {

	public static void main(String[] args) {
		
		Me m= new Me();
		m.start();
		//m.start(); we can't invoke a thread again until the previous thread gets dead.
		System.out.println("main thread");
	}
}
