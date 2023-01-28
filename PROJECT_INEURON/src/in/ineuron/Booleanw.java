package in.ineuron;

public class Booleanw {
	public static void main(String[] args) {
		
		Boolean b= new Boolean(true);
		if(b) // first b.toString() will be returned it will be autounboxed to boolean primitive.
		{
			System.out.println("b");
		}
		Boolean b2=true;
		Boolean b3=true;
		System.out.println(b2==b3);
		
		
	}

}
