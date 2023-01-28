package in.ineuron;


public class Finalize {
	
	@Override
	public void finalize()
	{
		System.out.println("finalize method will be called by gc");
		
	}
	public static void main(String[] args) {
	
		Finalize f= new Finalize();
		f=null;
		/* finalize method will be called only when there is memory to clean here we have made f= null which 
		 means that there is an object available which has no reference to be cleaned by gc.
		in above if we comment line 15 then even by calling System.gc() finalize method will not be called because there is no need to call it.
		 as there are no objects.*/
		
		System.gc();
	}
	
}
