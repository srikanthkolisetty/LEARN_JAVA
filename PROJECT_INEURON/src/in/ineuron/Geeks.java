package in.ineuron;
//Java Program to illustrate the
//concept of interrupt() method
//while a thread stops working

class Geeks extends Thread {
	public void run()
	{
		try {
			Thread.sleep(2000);
			System.out.println("Geeksforgeeks");
		}
		catch (InterruptedException e) {
			throw new RuntimeException("Thread " +
									"interrupted");
		}
	}
	public static void main(String args[])
	{
		Geeks t1 = new Geeks();
		try {
       	t1.start();
	
			t1.interrupt();
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
}

