package in.ineuron;
import java.io.*;
public class ReadingFile {

	public static void main(String[] args) throws Exception {
		
		
		FileReader r= new FileReader("abc.txt");
		int i =r.read();
		while(i!=-1)
		{
			System.out.println("converting ascii to char "+(char)i);
			System.out.println(i);
			i=r.read(); // reads one character at a time.
		}
		
		File f= new File("abc.txt"); // method length is undefined for type FileReader 
		System.out.println(f.length()); // return type of length() is long.
		char[] c=new char[(int)f.length()];
		System.out.println(r.read(c));
		for(char j:c)
			System.out.print("j"+j); // here we are getting no data because we already read the data in the above code.
		
		r.close();
	}
}
