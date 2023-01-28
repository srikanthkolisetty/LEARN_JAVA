package in.ineuron;

class Ped
{
	public void jan()
	{
		throw new RuntimeException("run time ");
	}
}
class Peed
{
	public void jann()
	{
		Ped d= new Ped();
		d.jan();
	}
}

public class Exceptione {

	public static void main(String[] args) {
		
		try {
			Peed d= new Peed();
			d.jann();
		}
		catch(RuntimeException e)
		{
			System.out.println("exception handled");
		}
		
	}
}
