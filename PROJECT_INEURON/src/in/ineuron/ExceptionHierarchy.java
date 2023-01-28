package in.ineuron;

import java.io.FileNotFoundException;

public class ExceptionHierarchy {

	public static void main(String[] args) {
		
		try
		{
			throw new FileNotFoundException();
		}
		catch(Exception e)
		{
			
		}
//		catch(FileNotFoundException e) {
//			
//		}
		//The above commented lines give error as they are unreachable code.
	}
}
