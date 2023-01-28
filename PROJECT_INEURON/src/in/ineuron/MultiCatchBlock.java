package in.ineuron;

public class MultiCatchBlock {

	public static void main(String[] args) {
		
		try {
			int a=10/0; // an arithemetic exception
		}
		catch(Exception | ArithemeticException e) // error because both Exception and ArithemeticException can handle the raised exceptions.
		{
			
		}
		
		// above catch block is called as multi catch block.
		// for try with resources try block can be written independently.
		try(java.util.Scanner s= new java.util.Scanner(System.in)) // here s will be treated as final 
		{
			s= new Scanner(System.in); // this not allowed can't reasign 
		}
		//no need to write finally.
	}
}
