package in.ineuron;

public class StringLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StringBuffer e= new StringBuffer(1000);
				//e=(StringBuffer)"shiva"; // type casting from string buffer to string can't be done
				//string is high data type than stringbuffer.
				e.append("Shiva");
				System.out.println(e.capacity());
				System.out.println(e.length());		
				/*
				to set the capacity by using a method called ensureCapacity();
				*/
				e.ensureCapacity(10);
				System.out.println(e.capacity());
				System.out.println(e.reverse());
				System.out.println(e.charAt(0));
				System.out.println(e.insert(2, "Shiva")); // starts from 2 index and then adds the string Shiva;
				System.out.println(e.deleteCharAt(3));
				System.out.println(e.delete(0, 3));
				System.out.println("for all the above changes no new object will be created until the capacity is enough");
				System.out.println(e);
				e.trimToSize(); // used to reduce the storage capacity of string buffer when we think  that there is no need for data to be stored above certain capacity.
				
				System.out.println(e.capacity());
				String s="shivs";
				System.out.println(s.replace('s', 'a')); // all the s characters will be replaced by the 'a'.
				
				// StringBuffer methods are synchronized , thread safe.
				System.out.println(""=="");  //true 
				
				System.out.println(s.substring(0,3));
				e.setLength(10); // setting the length of the string buffer class
				String s2="Om Namah Shivaya";
				String[] s3=s2.split(" "); //split function returns an array which is of type string.
				System.out.println(String.join(" ",s3)); // join method is also present here.
				System.out.print(-(-2));
	}

}
