package in.ineuron;

public class ExceptionInitializeError {

	static int []a;
	static{
		a[0]=1; // this line gives an exception generally it should give a ArrayIndexOutOfBounds Exception
	}
/*
 * 
 * Any exception that raises in the static block will have the name as ExceptionInitializeError exception.
 * 	
 */
	
	public static void main(String[] args) {
		
	}
}
