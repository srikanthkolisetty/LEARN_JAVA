package in.ineuron;
import java.io.*;
import java.util.*;

public class HackerRank {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i=Integer.parseInt(scan.nextLine());
	        System.out.println();
	        String s = scan.nextLine();
	        // Write your code here.
	        String[]ar=s.split("[? @ ! , '']");
	        ArrayList<String> a= new ArrayList();
	        for(String d:ar)
	        {
	            if(d.isBlank()==false)  a.add(d);
	        }
	        System.out.println(a.size());
	        
	        scan.close();
	    }
}
