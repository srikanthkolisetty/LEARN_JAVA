package in.ineuron;
import  java.util.ArrayList;
import java.util.Collections;
public class For {

	public static void main(String[] args) {
	
		
		ArrayList<Integer>a= new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(15);
		Collections.sort(a, Collections.reverseOrder()); //Collections.reverseOrder() returns a comparator
		System.out.println(a);
		
		a.forEach(System.out::println); // method reference to consumer functional interface accept method
		
		Collections.sort(a,Collections.reverseOrder());
}
}
