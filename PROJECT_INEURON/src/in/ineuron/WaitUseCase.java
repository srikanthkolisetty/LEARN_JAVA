package in.ineuron;

class Notifyy  
{
	
	Thread t= new Thread(()->System.out.println("hi"),"thread-10"); 
	// second argument is setting the name of the thread.

}
public class WaitUseCase extends Thread{

	
	// here synchronized will not make impact as we are using multiple objects.
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome t");
	}
	
	public static void main(String[] args) throws Exception{
		
		WaitUseCase b,a;
		a= new WaitUseCase();
		a.start();
		
		synchronized(b=new WaitUseCase())
		{
			//Thread.currentThread().wait(); this line gives exception because we invvoke wait and other methods on objects not direclty on threads as they are not thread class methods
		//	new WaitUseCase().wait(); // this line also gives error because we not acquired lock on same object here we are giving another new object
			Thread.sleep(2000);
			b.wait();
		}
		System.out.println("after wait");
	// when there is no other thread to call notify() method and if all other threads execution is completed
		// then the jvm  will invoke a notifyAll() method in order to complete the execuiton and this is invoked only when no other thread calls
		//notify() or notifyAll() method and also no remaining threads to execute.
		
		/*
		 * 
		 * But we should not allow this to happen in the real time scenarios as it calls notifyAll() all other threads gets executed.
		 */
	
	}
}
