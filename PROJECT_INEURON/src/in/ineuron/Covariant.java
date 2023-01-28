package in.ineuron;

class D{
	public D inn()
	{
		System.out.println("in method");
		return new D();
	}
}
class Y extends D
{
	
}
public class Covariant extends D{
	
	public Y inn() // here return type is covariant.
	{
		System.out.println("in method override");
		return new Y();
	}
	
 public static void main(String[] args) {
	
	 new Covariant().inn();
	 5
}
}
