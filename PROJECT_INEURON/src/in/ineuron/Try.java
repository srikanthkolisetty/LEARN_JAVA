package in.ineuron;

public class Try {
	public static void main(String[] args) {
			
		int a=10,b=0;
		int c=10/0;
		try {
			 throw new ArithmeticException();
			//System.out.println("after exception raised statement"); 
			// 9 th line will give error as unreachanble code.
		}
		catch(Exception e)
		{
			System.out.println("catch statement must be immediately after the exception");
		}
		//System.out.println("b/w finally");
		finally
		{
			System.out.println("finally");
		}
	}
}
/*
 * the code inside the finally block will be executed even if the exception raised and not handled.
 * no intermediate statements b/w try catch and also b/w catch and finally.
 */
