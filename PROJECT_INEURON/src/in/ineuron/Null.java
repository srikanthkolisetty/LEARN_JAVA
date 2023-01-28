package in.ineuron;

import java.io.PrintStream;

public class Null {
	public static void main(String[] args) {
		
		String s=null; // null can be assigned 
		Integer i=null;  // can be assigned , similarly for all other wrapper objects it can be assgned
		String s2=(String)null;
		PrintStream p=System.out;
	//	p.println(i.getClass().getName()); // error because i is null no operation allowed
		String f=null+"null"; //null can be only concatenated with string 
	//	String g=null+null // this is error here null+ null any one of them should be string
		p.println(null==null); //can compare null
		//only reference types can store null 
//this line gives error		//StringBuffer se= new StringBuffer(null); // stringbuffer is thread safe 
		// se.append(null); // gives error because append() is an overloaded method and null can be accepted by append(String s), append(StringBuilder s) and append(StringBuffer s) out of these three methods compiler gets confusion about which method to invoke.
		StringBuilder w=null; // no error.
	}

}
