package in.ineuron;
import java.io.*;
import java.util.stream.*;
public class Filee {

	public static void main(String[] args) throws Exception{
		File f= new File("abc.txt");
		//above line creates a reference and points the reference to the file if it is present 
		// if there is no file then a java file object will be created.
		System.out.println(f.exists());
		f.createNewFile(); // this method throws a checked exception
		//this method creates a file only if it is not present other wise it will not do any thing.
		System.out.println(f.exists());// returns true if the file present
		File f1= new File("abc");
		System.out.println(f1.exists());// returns false because it is not abc.txt 
		// when we not pass the extension then by jvm it will be treated as directory not a file.
		f1.mkdir();
		System.out.println(f1.exists());
		File f2= new File(f1,"abc.txt");
		f2.createNewFile();
		String location ="d://srikanth";
		File g= new File(location);
		g.mkdir();
		String [] list =g.list();
		System.out.println(list);
		System.out.println(list.length);
		for(String s:list)
			System.out.println("sd"+s);
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		
		boolean b=Stream.of(1,2,3,4).allMatch((n)-> n%2==0);
		System.out.println("stream"+b);
	
	}
}
