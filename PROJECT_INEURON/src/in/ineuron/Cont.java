package in.ineuron;

public class Cont {

	static public void main(String args[]) {
		int x = 1;
		switch (x) {
//		case "ll": // error because of case labell is not of int type
//			break;
		default : System.out.print("inside default");
		case 1:
			System.out.print("case 1");
			// continue; // error because continue can be only used in loops and labelled
			// loop
			break;
		}
		
// fall through happens in above switch case 
		$: {
			System.out.print("in block of name $");
			// if (x==0) continue $; // continue can only be used inside loops
		}
		if (true)
			System.out.print("p");
		else
			System.out.print("o");
		// the above statement in else is not treated as unreachable statement. Unreachable statement holds good only in loops, the above one gets executed
	}
}
