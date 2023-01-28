package in.ineuron;


public class NewInstance {

	
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		
		Class c=Class.forName(args[0]);
		Object o=c.newInstance();
	}
	
	// if constructor is private for loading class we get IllegalAccessException
	/*if default constructor not specified and specified some parameterized constructor but here we are
	 * trying to access zero param constructor then we get InstantiationException.
	 */
}

