package in.ineuron;

class Sec 
{
	 synchronized void met()
	{
		System.out.println("in met");
		this.notify();
	}
}

public class Notify extends Thread{

	static Sec c;
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(c);
		c.met();
	}
	public static void main(String[] args) throws Exception {
		
		c= new Sec(); // if we write this as Sec c = new Sec(); it will create a new c variable not uses the static c variable.
		new Notify().start();
		synchronized(c)
		{ 
			System.out.println("before wait");
			Thread.sleep(10000);
			c.wait();
		}
	}
}

