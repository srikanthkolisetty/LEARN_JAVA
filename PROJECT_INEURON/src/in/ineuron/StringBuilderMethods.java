package in.ineuron;

public class StringBuilderMethods {

	public static void main(String ...args) {
		StringBuilder s= new StringBuilder();//empty object with default capacity 16
		s.append("shiva");
		s.append(1);
		s.append(10L);
		s.append(10.90f);
		s.append(10.99);
	/*
	 * append() method is overloaded and it can accept int,long,float,double and string
	 */
		StringBuilder t= new StringBuilder(null);// exception because jvm will calculate the length of the passed parameter as it can be stored in string the coonstructor with string parameter will be invoked
		System.out.println(s.capacity());
		System.out.println(s.length());
		System.out.println(s.insert(0,"shu"));
		System.out.println(s.insert(1,1));
		System.out.println(s.insert(2,2.3));
		System.out.println(s.insert(3, true));
		System.out.println(s.append(true));
		// append() and insert() methods can accept boolean also
		s.deleteCharAt(10);
		s.delete(0, 3);
		s.setCharAt(9, 's');
		System.out.println(s.charAt(12));
		// Integer o=(Integer)"2"; can assign string to integer only through valueOf() method.
		//28 line raises exception since compiler will not find it. This exception will be handled by default exception handler.
		
		
		
	}
}
