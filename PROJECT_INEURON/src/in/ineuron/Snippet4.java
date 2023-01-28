package in.ineuron;
import java.io.FileNotFoundException;
public class Snippet4 {
	
	
	static void m2() throws Exception
	{
		final String w="l";
		
		//can use only final modifier but not others.
	}
	public void Snippet4()
	{
		// can have the same name as class name 
	}
	public static void main(String[] args) throws FileNotFoundException{
	
		String Snippet4; //class names can be used as identifier 
		
		try {
			for(;;)
			{
				
			}
		}
		catch(Exception e)
		{System.out.println("srikanth");}
//		catch(ArithmeticException e)
//		{
//			
//		} second catch block will get error because the unreachable code.
		System.out.println("hi");
		m2(); //should handle when we are saying throws.
	}
// this code will not get compile time error even if it is not having any code related to 
	// file not found exception.
	/* even in this case the code will not get un reachable code error
	 * 
	 *   because we are writing it in try catch block.
	 */
}
