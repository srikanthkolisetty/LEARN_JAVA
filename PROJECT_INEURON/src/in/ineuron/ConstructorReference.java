package in.ineuron;

interface If
{
	void get();
}



public class ConstructorReference {
	
	ConstructorReference()
	{
		System.out.println("inside the constructor");
	}
	
	
	public static void main(String[] args) {
		
		
		If f=ConstructorReference::new;// as the return type of get method is void we can assign any return type compatible function or constructor.
		f.get();
		
		
	}

}
