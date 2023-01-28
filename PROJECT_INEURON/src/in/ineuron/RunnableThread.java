package in.ineuron;

class Th implements Runnable
{
	public void run()
	{
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName()); // default name is Thread-0
		
	}
}


//runnable is also a functional interface.
public class RunnableThread {

	public static void main(String[] args) {
		Th y= new Th();
		
		Thread s=new Thread(y); // calling another constructor of thread class
		s.start(); //creates new thread 
		s.run();//no new thread but our class Th run method gets executed. this behaviour is because we are passing the object to thread class constructor.
		y.run();//no new thread executesas normal method .
		
		System.out.println(Thread.currentThread().getName()); //default name is main thread
		Thread.currentThread().setName("shiva");
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
}
