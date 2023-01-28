package in.ineuron;
import java.io.*;
public class FileChecking {
public static void main(String[] args) {
	File f= new File("d://");
	File []d=f.listFiles((n)->n.isDirectory()); // listFiles() method
	for(File f1:d)
		System.out.println(f1);
	String [] l=f.list();
	for(String k:l)
	{
		File f3= new File(f,k);
		if(f3.isFile())
		{
			System.out.println("file");
			if(k.endsWith(".txt"))
			{
				System.out.println("txt file");
			}
			else if(k.endsWith(".pdf"))
			{
				System.out.println("pdf");
			}
			
		}
		else
		{
			System.out.println("directory");
		}
	}
	
}
}
