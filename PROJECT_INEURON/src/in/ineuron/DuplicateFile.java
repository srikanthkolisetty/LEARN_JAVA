package in.ineuron;
import java.io.*;
public class DuplicateFile {

	public static void main(String[] args) throws Exception {
		
		boolean avail=false;
		PrintWriter w= new PrintWriter("to.txt");
		w.println("123");
		w.println("456");
		w.println("789");
		PrintWriter w2= new PrintWriter("too.txt");
		w2.println("222");
		w2.println("456");
		w.close();w2.close();
		BufferedReader r1= new BufferedReader(new FileReader("to.txt"));
		String data1=r1.readLine();
		PrintWriter w3= new PrintWriter("dele.txt");
		while(data1!=null)
		{
			BufferedReader r2= new BufferedReader(new FileReader("too.txt"));
			String data2=r2.readLine();

			while(data2!=null)
			{
				if(data1.equals(data2))
				{	
					avail=true;
					break;
				}
				data2=r2.readLine();	
			}
			if(avail==false)	w3.println(data1);
			System.out.println(data1);
			data1=r1.readLine();
			r2.close();
			avail=false;
		}

w.close();
w2.close();
w3.close();
r1.close();

	}
}