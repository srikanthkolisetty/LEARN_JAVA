package in.ineuron;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="shiva"; // one way of string object creation
			String s1=new String("shiva_parvathi");
			System.out.println(s+" "+s1); // both returns the names that are passed
			//output: shiva shiva_parvathi
			s1.concat("_ganesh");
			/* as s1 is immutable object it will not effect the old object 
				it will create an new object with new content and returns that  reference */
			System.out.println(s1); // o/p: shiva_parvathi as we are not capturing our concatenation operation in s1, s1 will point to the one which is created at first.
			/* concatenation operation object will be having no reference*/
			StringBuilder s2=new StringBuilder("srikanth");
			s2.append("should go with shiva"); // for stringbuilder class we have append() method it does not have concat() method
			System.out.println(s2);
			/* stringbuilder,stringbuffer both are mutable,data can be changed.*/
			StringBuilder s3=new StringBuilder("srikanth");
			s3.append("should go with shiva");
			System.out.println(s3.equals(s2)); //returns false because the equals() method of stringbuilder works as == operator
			
	}
	

}
