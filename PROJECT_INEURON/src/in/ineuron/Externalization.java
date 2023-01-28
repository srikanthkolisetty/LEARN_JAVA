package in.ineuron;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.*;

class Exter implements Externalizable
{
	transient int k=20;
	int i=10;
	int j=20;
	public Exter()
	{
		System.out.println("zero arg constructor");
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(i);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	//	int j=in.readInt(); if we use int before j then it becomes local variable
		// when it becomes local variable then that will not be mapped to created object instance variable.
		j= in.readInt();
	}
	
}

public class Externalization {
	
 public static void main(String[] args) throws Exception {
	
	 FileOutputStream fp = new FileOutputStream("in.ser");
	 ObjectOutputStream o= new ObjectOutputStream(fp);
	 Exter e= new Exter();
	 o.writeObject(e);
	 FileInputStream f= new FileInputStream("in.ser");
	 ObjectInputStream op= new ObjectInputStream(f);
	 Exter r=(Exter)op.readObject();  // it creates a new object and in this new object the values of variables will be replaced depending on the logic we have written in writeExternal and readExternal method
	 System.out.println(r.j);
	 System.out.println(r.i);
	 System.out.println(r.k);// transient will have no impact because here we obtain a new object and into that new object we map the serialized data.
	 // the difference here is in in.ser file we will have data of only one variable that value we are storing in j again which will be mapped to created object j variables.
}
 
 // here also if we do not provide zero arg constructor it gives invalidclassexception.
}
