package in.ineuron;

public class CatchingError {

	public void go()
	{
		go();
	}
	public static void main(String[] args) {
		
		try
		{
			new CatchingError().go();
			//throw new Error();
		}
		catch(Error r)
		{
			System.out.println("error caught");
//			new CatchingError().go()
			}
		
		// the line 13 makes a call to go method
		// in the go method stack overflow error will be raised
		// jvm checks whether it is handled or not and we are handling it by writing Error r in catch.
		//Error can also be handle as it is one of the sublass of Throwable
	}
}
