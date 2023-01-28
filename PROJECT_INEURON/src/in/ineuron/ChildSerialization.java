package in.ineuron;
import java.io.*;
class Mother //implements Serializable
{
	transient int i=10; // here having transient will not work because. it will work if include implements Serializable statement  
	int k=90;
//	Mother(int i)
//	{
//		System.out.println(i);
//	}
	// if the above constructor present then we should also provide default zero arg constructor other wise exception will be raised
	Mother()
	{
		System.out.println("constructor");
	}
}
//case 1 : if parent class is serializable then follows normal proces
// case2: if parent class is non serializable then follows other process.

class Childern extends Mother implements Serializable
{
	
	int j=99;
	Childern()
	{
	//	super(10);
	}
}
public class ChildSerialization {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fo= new FileOutputStream("chil.ser");
		ObjectOutputStream o= new ObjectOutputStream(fo);
		Childern d= new Childern();
		d.j=999;
		d.i=200;
		o.writeObject(d); // here for the variables of non serializable parent class default values based on data type will be stored.
		System.out.println("de serialization");
		Childern g=(Childern)new ObjectInputStream(new FileInputStream("chil.ser")).readObject();
		System.out.println(g.k);
		System.out.println(g.j);
		System.out.println(g.i);// this value will be 10 not 20 refer to the compiler_java2 notepad file
	// this will work by creating object of non serializable parent class if any of its instance variables present by calling zero arg constructor.
	// and mapping the value to the child class objects parent instance variable for which jvm will give default value.	
	// if jvm not founds any zero arg constructor then it will give an exception called as InvalidClassException
	//java.io.InvalidClassException:
	}
}
