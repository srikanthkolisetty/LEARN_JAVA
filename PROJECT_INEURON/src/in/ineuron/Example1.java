package in.ineuron;


interface Q
{
	private  void m2()
	{
		System.out.println("public method");
	}
	// only private modifiers concrete method allowed no public modifier method allowed.
}
public class Example1 {

	public static void main(String[] args) {
		
		//Double b=10; //here first int converts to Integer then the Integer converts to Number
		Double q=10.0;
		int a=q.intValue(); // intValue(),byteValue(),longValue(),floatValue() ... wrapper to primitive.
		System.out.println(a);
		Boolean b=Boolean.valueOf("dtht");
		System.out.println(b);
	}
}
