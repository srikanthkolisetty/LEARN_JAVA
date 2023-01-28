package in.ineuron;
import java.io.*;
public class Thr {

	void one() throws Exception
	{
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		
		try {
			new Thr().one();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("x");
		}
		catch(Exception e)
		{
			//System.out.println("y");
		}
		finally {
			System.out.println("z");
		}
		
	}
}
