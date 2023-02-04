package in.ineuron;

class Rr
{
	public void empty()
	{
		System.out.println("hi");
	}
}
class Tt extends Rr
{
	int i=0;
	public void empty()
	{
		System.out.println(i);
		System.out.println("hii");
	}
}
public class Samplee {
	
public static void main(String[] args) {
	
	Rr r= new Tt();
	r.empty();
	
}
}
