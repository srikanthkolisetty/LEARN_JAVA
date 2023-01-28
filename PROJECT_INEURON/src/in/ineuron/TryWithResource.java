package in.ineuron;

public class TryWithResource {
	public static void main(String[] args) {
		
	java.util.Scanner d= new java.util.Scanner(System.in);
		d.close();
		try(String s=new String("sachin");) 
		{
			
		}
		catch()
		{
			
		}
		try(java.util.Scanner e= new java.util.Scanner(System.in))
		{
			
		}
		catch(Exception e)
		{
			
		}
		int y=e.nextInt(); // this line gives error because the resource e will be closed after the try block execution is completed.
	}
/*
 *Scanner class also implements the AutoCloseable interface.
 *  we get exception because the resource type String does not implement 
 * java.lang.AutoCloseable.
 * 
 * 
 */
}
