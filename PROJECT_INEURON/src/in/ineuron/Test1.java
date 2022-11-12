package in.ineuron;

public class Test1 {
	public static void main(String args[]) {
		int a=10;
		System.out.println("hi");
		switch(a) {
		default : System.out.println("op");
		break;
	/* default can be placed any where  and no duplicate labels in switch case, only compiler constants are allowed as labels
 and variables of declared wih final are allowed. label range should be with in arg data type.	 
	  */
	 
		case 10:
			System.out.println("l");
		case 20:
			System.out.println("P");
			break;
		}
	}
}
