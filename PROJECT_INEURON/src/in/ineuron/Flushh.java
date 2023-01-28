package in.ineuron;
import java.io.*;
public class Flushh {

	public static void main(String[] args) throws Exception {
		
		FileWriter t= new FileWriter("abc.txt",true);
		t.write("one");
		t.write(98);
		t.write('p');
		t.flush();
		// either we should close or flush to reflect the data in file
		// we can do both.
		
	}
}
