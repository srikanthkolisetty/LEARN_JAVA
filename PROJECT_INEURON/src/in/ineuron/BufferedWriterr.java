package in.ineuron;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class BufferedWriterr {

	public static void main(String[] args) throws Exception {
		
		FileWriter r= new FileWriter("abc.txt",true);
		BufferedWriter r1= new BufferedWriter(r);
		r1.write("hi shiva");
		r1.newLine(); // if we want to insert a new line using writer object we should pass \n
		r1.write("hello ganesh");
		r1.flush();// need to invoke to get the data reflect into file.
		r1.close();
		//no need to explicitly close FileWriter it will be closed when we close bufferedWriter
	
		FileReader r3= new FileReader("abc.txt");
		BufferedReader r2=new BufferedReader(r3);
		String g=r2.readLine();
		while(g!=null)
		{
			System.out.println(g);
			g=r2.readLine();
		}
	}
}
