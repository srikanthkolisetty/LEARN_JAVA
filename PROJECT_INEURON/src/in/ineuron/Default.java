package in.ineuron;

public class Default {

	public void add() throws Exception{
		
		throw new Exception(); // here we are raising so we should must say throws
	}
	
	void divide()
	{
		int a=10,b=0,c;
		c=a/b; // here exception will be raised but as we are not handling jvm checks for handling in the caller method
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Default d= new Default();
		//d.add();
		d.divide();
	}
}

/*
 * 
 * throws is recommended to use for checked exception where we are confident that no exception raise but compiler identifies it as risky code.
 */
