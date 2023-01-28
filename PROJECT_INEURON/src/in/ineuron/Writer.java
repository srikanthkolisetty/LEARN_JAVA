package in.ineuron;

import java.io.*;
public class Writer {
	public static void main(String[] args) throws IOException{
		
		FileWriter s= new FileWriter("123.txt");
		s.write("123");
		s.write(97);
		s.write("Hello siva");
		char c[]= {'a','w','p'};
		s.write(c);
		s.write("\n");
		s.write("in the next line");
		s.close();
		System.out.println("end");
		
	}

}
