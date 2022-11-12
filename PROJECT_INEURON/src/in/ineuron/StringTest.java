package in.ineuron;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s= new String("shiva");
			String s1= new String("shiva");
			StringBuffer s2= new StringBuffer("shiva"); // two objects one in heap and other in scp
			if(s.toString()==s)	System.out.println("same object pointing"); // no new object creates because no change on the s object it is already in string type.
			if(s2.toString()==s) System.out.println("same object pointing");
			else System.out.println("not same");
			//s2.toString() creates a new object because stringbuffer to string type is changing so object creation happens
			
		System.out.println(s.replace('s', 'S')); // creates a new object in heap but we are not having any reference to it and the object gets remove after this line gets executed
		
	// runtime operation (change in content,change in type) results in object creation in heap.
	// new in string buffer , string two objects will be created.scp,heap
	// no duplicates allowed in scp
	// in java data is also case sensitive
	// equals() in stringbuffer same as ==
		
	StringBuffer s5= new StringBuffer("shiva"); 
	System.out.println(s5.capacity()); // length of string+default capacity
	StringBuffer s6= new StringBuffer(100); // an empty string with 100 capacity will be created
	// gc will not remove the objects ins scp though they may not have references.
	// replace() method replaces all the oldcharacters with the newcharacters we mentioned.
/*
 * equals()
 * equalsIgnoreCase()
 * lastIndexOf()
 * indexOf()
 * length()
 * trim()
 * charAt()
 * toLowerCase()
 * toUpperCase()
 * concat()
 * replace()
 * substring() 
 * string buffer and string builder are same 
 */

	}
}