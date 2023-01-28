package in.ineuron;
import java.io.*;
class Father implements Serializable
{
	
	Father()
	{
		System.out.println("parent class constructor");
	}
}

class Child extends Father
{
	Child(){
		System.out.println("child class constructor");
	}
	int i=10;
	int j=20;
}
public class SerializableInheritance  {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream f= new FileOutputStream("inher.ser");
		ObjectOutputStream o= new ObjectOutputStream(f);
		Child d= new Child();
		o.writeObject(d);
		System.out.println("serialization started");
		FileInputStream fp= new FileInputStream("inher.ser");
		ObjectInputStream op= new ObjectInputStream(fp);
		Child c=(Child)op.readObject();
		System.out.println(c.i);
		System.out.println(c.j);
		
	}
}
