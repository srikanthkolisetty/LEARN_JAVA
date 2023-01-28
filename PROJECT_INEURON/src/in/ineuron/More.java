package in.ineuron;


interface Won
{
	default void phone()
	{
		System.out.println("in default");
	}
	
}

interface Wone
{
	default void phone()
	{
		System.out.println("in default t");
	}
}

interface Wer extends Won,Wone
{

	default void phone() {
		// TODO Auto-generated method stub
		Won.super.phone();
	}
	
	
}
public class More {

	public static void main(String[] args) {
		
	}
}

