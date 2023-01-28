package in.ineuron;

class B
{
	public void intr()
	{
		System.out.println("in the method");
	}
}



public class Edds {
		
	B b= new B();
	//b.int() this line gives error because actions can be done only inside methods or blocks only
	{
		b.intr();
	}
	public static void main(String[] args) {


	}

}
