package in.ineuron;


//enum can be declared inside a class ,or outside a class or in seperate package even.
public class EnumInSwitch {

	enum Re
	{
		ONE,TWO,THREE; // by default these are public static final and should written in capital only
	 int b=10;
	}
	int a;
	final static int p=30;
	static final int y=40;
	public static void main(String[] args) {
		
		switch(Re.ONE.b) // we can only use variables declared inside enum in switch.
		{
		case 10:
			System.out.println("one");
			break;
		case 20:
			System.out.println("two");
			break;
		}
		// to access the instance variables inside static method we should make use of object
	}
}
