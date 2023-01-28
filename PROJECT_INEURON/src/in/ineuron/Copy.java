package in.ineuron;
import java.io.*;
public class Copy {

	public static void main(String[] args) throws Exception{
		
		File f1=new File("abc.txt");
		File f2=new File("123.txt");
		
		File[] a= new File[2];
		a[0]=f1;
		a[1]=f2;
		File f3= new File("copy.txt");
		f3.createNewFile();
		PrintWriter r2= new PrintWriter(new FileWriter(f3));
		for(File f:a)
		{
			BufferedReader r= new BufferedReader(new FileReader(f));
			String g=r.readLine();
			while(g!=null)
			{
				r2.println(g);
				g=r.readLine();
			}
		}
		r2.close(); //close() method is must 
	}
}
