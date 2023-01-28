package in.ineuron;

class The extends Thread
{
	@Override
	public void run() {
		System.out.println("in run method");
	}
}
class Thee extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<3;i++)	System.out.println(i);
	}
}
public class ThredPriority {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(3); 
		The t= new The();
		t.start();
		t.setPriority(2);
		Thee t1= new Thee();
		
		t1.setPriority(7);
		t1.start();
		System.out.println("main");
		// we can set the priority after starting the thread but it is not recommended
		/*
		 * 
		 * When you already started the thread it may start execution of that and for the setPriority() 
		 * line to execute it may not happen immediately 
		 */
		//It is always recommended to set all the things related to thread before starting it.
	}
}
