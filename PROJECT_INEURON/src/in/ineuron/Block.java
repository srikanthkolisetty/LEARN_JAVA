package in.ineuron;
import java.io.*; //for some checked exceptions we need to import 
public class Block {

	public static void main(String[] args) throws InterruptedException,IOException{
		
		blok:
		{
			System.out.println("hi");
			System.out.println("Hi");
		}
	try
	{
		
	}
	catch(Exception e)
	{
		
	}
	// this will compile fine but if we write IOException instead of Exception then it will give compile time error
	/*
	 * It gives compile time error when we write IOException because it is a checked exception and as compiler predicts whether 
	 * there is a code present or not present that may raise checked exception.
	 * As compiler not founds any chekced exception raise case it will give compile time error.
	 * 
	 */
	}
}
