package in.ineuron;

class Demo{
	Demo()
	{
		System.out.println("demo constructor");
	}
}

public class Memory {
		
	Demo d= new Demo(); // for this class this also considered as instance variable only
	Memory()
	{
		System.out.println("Memory constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memory m= new Memory(); //output : demo constructor Memory constructor
 		

	}

}
