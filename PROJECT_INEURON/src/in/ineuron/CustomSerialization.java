package in.ineuron;
import java.io.*;

class Custom implements Serializable{
	
	String username ="shiva";
	transient String password ="Shiva";
	transient int pin=122;
	private void writeObject(ObjectOutputStream m1) throws Exception{
		m1.defaultWriteObject(); //performing default serialization
		String enpassword=password+"1"; // our own logic like encryption
		m1.writeObject(enpassword);
		m1.writeInt(pin);
	}
	private void readObject(ObjectInputStream m2) throws Exception
	{
		m2.defaultReadObject(); // performing default deserialization
		
		password =(String)m2.readObject();
		pin=  m2.readInt();
		password=password.substring(0,password.length()-1);
	}
	
	
}

public class CustomSerialization {

	public static void main(String[] args) throws Exception {
	
	
	Custom c= new Custom();
	FileOutputStream f= new FileOutputStream("efg.ser");
	ObjectOutputStream o= new ObjectOutputStream(f);
	o.writeObject(c); // on invoking this method jvm will automatically also invoke writeObject inside the serializable implemented class
	
	FileInputStream f2= new FileInputStream("efg.ser");
	ObjectInputStream o2= new ObjectInputStream(f2);
	Custom m=(Custom)o2.readObject();
	System.out.println(m.password);
	System.out.println(m.pin);
}
}
