package in.ineuron;

abstract class Ineu
{
	int i;
	abstract public void sit();
	Ineu(int i)
	{
		this.i=i;
	}
} // abstract class can have constructor but we can't create any object for it.


public class Abstract  extends Ineu{
	
	public Abstract()
	{
		super(19);
	}
	public void sit() {
		System.out.println("in chid class");
	}
	
	public static void main(String[] args) {

	}

}
