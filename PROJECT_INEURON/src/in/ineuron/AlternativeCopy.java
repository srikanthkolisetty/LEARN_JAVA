package in.ineuron;
import java.io.*;
public class AlternativeCopy {

	public static void main(String[] args) throws Exception{
		
		BufferedReader r1= new BufferedReader(new FileReader("abc.txt"));
		BufferedReader r2= new BufferedReader(new FileReader("123.txt"));
		PrintWriter w= new PrintWriter(new FileWriter("alt.txt"));
		// for printwriter we can directly pass the filename, filewriter object is not mandatory.

		String g=r1.readLine();
		String g1=r2.readLine();
		while(g!=null && g1!=null)
		{
			w.println(g); 
			w.println(g1);
			g=r1.readLine();
			g1=r2.readLine();
		}
		if(g==null)
		{
			if(g1!=null)
			{
				w.println(g1);
				g1=r2.readLine();
				while(g1!=null)
				{
					w.println(g1);
					g1=r2.readLine();
			
				}
			}
		}
		else
		{
			w.println(g);
			g=r1.readLine();
			while(g!=null)
			{
				w.println(g);
				g=r1.readLine();
			}
		}
		w.write("hi this is srikanth");
		w.print("hi");
		w.close();
		r1.close();
		r2.close();
	}
	//printwriter extends writer class
	//fillewriter extends outputstreamwriter class and this class again extends writer class. 
}
