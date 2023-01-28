package in.ineuron;

public class ThreadStatic {

	static
	{
		System.out.println(Thread.currentThread().getName()); // this also gets executed by the thread called "main"
	}
	
	public static void main(String[] args) {
		
	}
}
