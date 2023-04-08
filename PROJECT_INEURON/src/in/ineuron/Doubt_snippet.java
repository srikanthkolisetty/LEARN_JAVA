package in.ineuron;
class Table
{
	public void me() {
		System.out.println("mee");
	}
}
public class Doubt_snippet {

	public static void main(String[] args) {
		
		int a[]= new int[0];
		
		Table t=null;
		synchronized(args)
		{
			try {args.wait();}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
}
}
