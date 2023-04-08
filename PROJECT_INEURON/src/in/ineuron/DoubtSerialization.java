package in.ineuron;
import java.io.Serializable; 
import java.io.*;
class ChildNon
{
	int i=10;
}
public class DoubtSerialization implements Serializable{

	final transient ChildNon c= new ChildNon();
	final transient int i=10;
	public DoubtSerialization()
	{
		System.out.println("obect");
	}
	public static void main(String[] args)  throws IOException, ClassNotFoundException{
		
		FileOutputStream fo= new FileOutputStream("200.ser");
		ObjectOutputStream ob= new ObjectOutputStream(fo);
		ob.writeObject(new DoubtSerialization());
		System.out.println("afteer");
		FileInputStream fi = new FileInputStream("200.ser");
		ObjectInputStream obj= new ObjectInputStream(fi);
		DoubtSerialization d=(DoubtSerialization)obj.readObject();
		System.out.println(d.c);
	//	d.c= new ChildNon();
	}
	
}
