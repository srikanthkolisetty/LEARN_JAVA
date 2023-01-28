package in.ineuron;


class T extends Thread
{
	public void start()
	{
		super.start() ;// this line create a new thread
	}
	public void run() // executed by user defined thread
	{
		System.out.println("user defined thread");
	}
	public void run(int i)
	{
		System.out.println("executed in the part of main thread");
	}
}
public class MultiThread3 {

	public static void main(String[] args) {
		
		T p= new T();
		p.start();//no new thread just calls the overriden method
		p.run(5);//main thread executes this method also.
	}
}
