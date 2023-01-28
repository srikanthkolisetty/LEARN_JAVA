package in.ineuron;

class Bs
{
	public void me() throws Exception
	{
		
	}
}

class A{
	
}
public class ExceptionOver extends Bs{

	public void me() throws Exception
	{
		
	}
	
	/*
	 * if the 5 line does not contain throws exception then it will give error at 12 line.
	 * always see the rule from child to parent.
	 * If parent has throws but child does not have it will not be a problem but if child has 
	 * and parent does not have then it will be a problem, and this rule is only for checked exceptions.
	 */
	public static void main(String[] args) {
		
		ExceptionOver d= new ExceptionOver();
		if(d instanceof Bs) // returns true as it has is -a relation ship with Bs class
		System.out.println("yes it is");
		 	System.out.println(null instanceof String); // false null has a relation like null will be stored in object references only.
		 	if(d instanceof A) // this line gives error because d has no relation with A 
		 	{
		 		
		 	}
	}
}
