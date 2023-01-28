package in.ineuron;
import java.io.IOException;
class Read
{
	static void m1() throws Exception
	{
		throw new IOException();
	}
}

public class Snippet12 {

	public static void main(String[] args) {
		try
		{
			Read.m1();
	
		}
		catch(IOException e)
		{
			System.out.println("k");
			
		}
		catch(Exception e)
		{
			System.out.println("l");
		}
		
	}
}
