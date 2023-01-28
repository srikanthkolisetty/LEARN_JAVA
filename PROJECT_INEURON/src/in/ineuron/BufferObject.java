package in.ineuron;

public class BufferObject {
	public static void main(String[] args) {
		
		Character c=127;
		System.out.println(c);
		Long g=126L;
		Long h=126L;
		System.out.println(g==h);
		// in auto boxing also type narrow conversion can  happen in the case of Byte,Character,Integer,Short.
		
		// for float and double we don't have predefined buffer objects.
		
	}

}
