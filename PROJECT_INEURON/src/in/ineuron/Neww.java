package in.ineuron;
import java.io.IOException;
abstract class EE
{
	public abstract void m() throws IOException;
}
public class Neww extends EE{

	public void m() 
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		
		try
		{
			EE e=new Neww();
			e.m(); // this gives error because compiler checks the method based on type
			// i.e chekcs in the parent class and there it finds that method may throw checked exception
			// as the exception is checked it identified it and forces us to handle.So that only we should write catch block
		}
		catch(IOException e) // here instead of IOException we should not write any other subclass exceptions of it.Because parent can't be stored in child.
		{
			
		}
		finally 
		{
			
		}
		
	}

}
