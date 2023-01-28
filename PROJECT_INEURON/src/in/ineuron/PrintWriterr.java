package in.ineuron;
import java.io.*;
public class PrintWriterr {
	public static void main(String[] args) throws Exception {
		
		FileWriter r= new FileWriter("abc.txt",true);
		PrintWriter p= new PrintWriter(r);
		p.println(1100); // inserts this data as int type
		
		p.println("hi srikanth"); // inserts this data as string and also moves to  a new line
		
		p.close();
	}

}
