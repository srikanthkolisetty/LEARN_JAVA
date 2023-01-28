package in.ineuron;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Integer i1=new Integer("1"); //allowed
		Integer i2= new Integer(1); //allowed
		// almost all wrapper classes have at most two constructors except character wrapper class.
		Character c= new Character('a');
		// Character l= new Character("p"); error because can't accept string.
		byte e= (true)? 20:30;
		System.out.println(e);
		Float f= new Float(10.0f); // float
		Float g= new Float(10.99); // double
		Float j= new Float("10.9"); // string 
		// only the float wrapper class has three constructors.
		Boolean b= new Boolean("True");//returns true
		Boolean n=new Boolean("true") ;// returns true
		Boolean k= new Boolean("TRUE"); //returns true
		Boolean o= new Boolean("falww");// other than true word any word is returns false.
		// wrapper classes overrided equals and tostring method
		//except boolean and character wrapper class remaining classes extends a class called Number, which Number extends Object class
		System.out.println(o.valueOf(b));
	}

	// purpose of these classes are to make the coding easy and make use of functions
}
