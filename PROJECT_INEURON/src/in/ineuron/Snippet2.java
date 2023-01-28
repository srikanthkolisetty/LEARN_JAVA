package in.ineuron;

class AA {
	 public String toString() {
	 return null;
	 }
	}

public class Snippet2 {
	public static void main(String[] args) {
	
		String text = null;
		AA a= new AA(); // here toString() method will not be called it is magic.
		 text = text + a; // whenever we need the value of object toString() method will be called 
		 System.out.println(text.length()); //Line n1	
		 String str = " Ineuron\tTechnology\tPrivateLimited\tKnown\tfor\tjava ".strip();
		 String s2="sachin ramesh tendulkar";
		 System.out.println(s2.substring(8, 4)); // gives StringIndexOutOfBoundsException.
				  System.out.println(str);// Ineuron Technology PrivateLimited Know for java
// \t prints a tab space
	}

	/*
	 * 
	 * if line 13 is returning a toString value then the return type of a should be string which is not the case above
	 * that means in that case toString() method will not be called.
	 */
}
