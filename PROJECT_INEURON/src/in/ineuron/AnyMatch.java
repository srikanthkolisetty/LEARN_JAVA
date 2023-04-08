package in.ineuron;
import java.util.ArrayList;
public class AnyMatch {

	public static void main(String[] args) {
		boolean match=false;
		ArrayList<Integer>a1= new ArrayList();
		ArrayList<Integer>a2= new ArrayList();
		a1.add(23);
		a1.add(1);
		a1.add(3);
		a2.add(2);
		a2.add(1);
		//code to check whether two lists are same or not
		match=a1.stream().allMatch(a2::contains) ; //accepts predicate (in predicate we have test method no writing method reference
		System.out.println(match);
	// method reference syntax object :: method name
		// code to check whether any elements in the array lists.
		match=a1.stream().anyMatch(a2::contains);
		System.out.println(match);
	//	int a[]= new int[2L]; array size should be in int,byte,short,char only
	}
}
