package in.ineuron;

public class WrapperUtility {
	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(20); // converting primitive to wrapper
		//now wrapper to primitive
		Integer t= Integer.valueOf("10");
		System.out.println(t);
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		Character s=Character.valueOf('p'); // primitive character to wrapper character.
		char g=s.charValue();
		System.out.println(g);
		// string to primitive type
		int d=Integer.parseInt("29");
		//char c=Character.parseChar("q"); string to char can't be converted. No parseChar() method present 
		String s2=Boolean.toString(true);
		String s3=Integer.toString(10);// we can also pass second argument which acts as radix.
		String et=String.valueOf(1); // primitive to string
		
		
	}

}
