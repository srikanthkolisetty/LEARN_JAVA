package in.ineuron;

public class Final {
	public final int a;
	public Final()
	{
		//this(10);
		a=100;
	}
	public Final(int a)
	{
		//this.a=a;
	}
	
// here for second constructor 	we are getting error because compiler don't 
	// know which constructor will be called and irrespective of the constructor the final variable should have value
	// suppose any object created using param constructor then it may not get the final variable value
	// so because of this reason we get error.
	// if we uncomment line 12 we will not get the error.
	
}
