package in.ineuron;

class Support extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
		for(int i=0;i<9;i++)	System.out.println("lazy");
		throw new ArithmeticException();
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		Support s= new Support();
		s.setDaemon(true);
		s.start();
		//s.setDaemon(true); this line gives error because we are setting this after starting thread.
		System.out.println("main end");
	// when main thread completes the execution then it is not compulsory that the daemon threads to get executed it may get executed or not.	
	
	}
}
