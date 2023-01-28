package in.ineuron;

class Over extends Exception {
	Over(String msg) {
		super(msg); // to sset the msg
	}
}

class Under extends Exception {
	Under(String msg) {
		super(msg);
	}
}

class Raised {
	public void message(String msg) throws Over, Under {
		if (msg == "hi") {
			throw new Over("first");
		} else if (msg == "hii") {
			throw new Under("Second");
		}

	}
}

public class Exception2 {
	public static void main(String[] args) {
		Raised d= new Raised();
		try
		{
			d.message("hi");
		}
		catch(Over|Under e) // catch can handle multiple exceptions
		{
			try
			{
				d.message("hii");
			}
			catch(Under | Over r)	
			{
				System.out.println("hi");
				System.out.println(r.getMessage()); // r is the exception object
			}
		
		}
		
		/*
		 * 
		 * If the inner try/catch block has exception and if it is not handled at inner level it can be handled at outer level if possible.
		 * 
		 */
	}
}
