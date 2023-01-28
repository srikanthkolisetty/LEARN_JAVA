package in.ineuron;
import java.util.ArrayList;
class Dog
{
	
}

interface Man
{
	
}

class Gen<T extends Dog&Man>  // while using extends if we have both interface and class 
								// class name should be written first and then interface name.
{
	
	public void add(T a)
	{
		System.out.println(a);
	}
}



public class Generics3 extends Dog implements Man{

	public static void main(String[] args) {
		
		Gen<Generics3> b= new Gen<Generics3>();
		b.add(new Generics3());
		
	//	ArrayList<String>a= new ArrayList<Integer>(); // this gives error. Can;t type cast from Integer to String
		ArrayList n= new ArrayList<String>(); //valid String to Object type.
	}
}
