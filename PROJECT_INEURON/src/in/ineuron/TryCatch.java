package in.ineuron;

public class TryCatch {

	public static void main(String[] args) throws Exception {
		
		try {
			
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("exception");
			throw e; 
		}
		finally
		{
			System.out.println("in the finally block");
		}
		// System.out.println("this line also gets executed");
		// line 20 gives error because as  an exception raised and we are not handling it here the other statements will not be executed. 
	}
	// the other statements after catch block will be executed only if the exception is handled.
}
