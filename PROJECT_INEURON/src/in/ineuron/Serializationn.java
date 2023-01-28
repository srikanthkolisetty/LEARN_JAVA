package in.ineuron;
import java.io.*;
class Dogg implements Serializable
{
	Dogg(){
		
	}
	static {
		System.out.println("in static");
	}
	public String toString()
	{
		return "dog class string representation";
	}
	int i=10;
	transient int j=20;
	static transient int k=30;
	final transient int l=40;
}
class Cat implements Serializable
{
	Cat()
	{
		System.out.println("cat constructor");
	}
	
}
public class Serializationn {

	public static void main(String[] args) throws Exception{
		Dogg g= new Dogg(); // if we not implement serializable interface then we get notserializableexception
		FileOutputStream f= new FileOutputStream("abc.ser");
		ObjectOutputStream o= new ObjectOutputStream(f);
		o.writeObject(g);
		Cat c= new Cat();
		o.writeObject(c);
		System.out.println("serialization completed");
		FileInputStream f2= new FileInputStream("abc.ser");
		ObjectInputStream o1= new ObjectInputStream(f2);
		Object obj=o1.readObject(); // first we get dog object as it is the first one passed to writeObject() method
		Object obje = o1.readObject();
		System.out.println((Dogg)obj);
		Dogg g1=(Dogg)obj;
		System.out.println(g1.i); //10
		System.out.println(g1.j); //0 
		System.out.println("deserialization ended");
		// the order which we serialized , the same we should be deserialized.
	System.out.println(g1.k); //30
	System.out.println(g1.l);//40
	// when we use transient along with static or final then there will be no impact of transient.
	//That is becase static variables won't come under object so serialization will not happen and 
	// final variables data will be known at compile time only.
	
	}
}
