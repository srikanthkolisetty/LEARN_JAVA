package in.ineuron;

public class LambdaRunnable {

	public static void main(String[] args) {
		
		Runnable r=() ->{
			System.out.println("run method");
		}; 
		// when there are no arguments then we should specify empty paranthesis.
		new Thread(r).start();
		System.out.println("main thread");
		//another way
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("anonymous class way run method");
			}
		}).start();
		
		// third way
		new Thread(()->{
			System.out.println("passing run method");
		}).start();
	}
}
// same code we can write it in anonymous inner class which can implement interface or extend class.
// the difference between lambda and anonymous inner class is for lambda no extra class will be created.
