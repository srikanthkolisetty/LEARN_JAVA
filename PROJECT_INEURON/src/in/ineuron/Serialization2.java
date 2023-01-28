package in.ineuron;
import java.io.*;
class Doge implements Serializable
{
	int i=10;
	Cate c= new Cate(); // when we have a variables as object then the object of class should also support for serialization if not gets exception
}
class Cate implements Serializable
{
	int j=30;
}
public class Serialization2 {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream f= new FileOutputStream("abcd.ser");
		ObjectOutputStream m= new ObjectOutputStream(f);
		Doge d= new Doge();
		m.writeObject(d);
		FileInputStream f1= new FileInputStream("abcd.ser");
		ObjectInputStream n= new ObjectInputStream(f1);
		Doge e=(Doge)n.readObject();
		System.out.println(e.c.j);
	}
}
