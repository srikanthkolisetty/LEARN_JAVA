package in.ineuron;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		t.add(10);
		t.add(20);
		t.add(13);
		t.add(13); // duplicates will not be stored but gives no error or exception
		//t.add(null); this gives exception
		t.add(40);
		t.add(21);  // no index based accessing 
		System.out.println(t);
		// output will be the inorder of the binary tree.
		System.out.println(t.ceiling(13)); // returns 13 if present, if 13 not present then the next higher value which greater than 13 in the tree will be returned.
		System.out.println(t.floor(13)); // if 13 present 13 will be returned . if it is not present then lower value which is nearer to 13 will be returned.
		
		System.out.println(t.higher(13));
		System.out.println(t.lower(13)); // even if 13 is present higher returns next higher element ,lower returns next lower element.
		
		// no index based accessing 
		Object o=2;
		int i=(int)o;
		System.out.println(i);
		System.out.println(t.higher(100)); // as there is no next higher element after 100 in the treeset it returns null
		System.out.println(t.ceiling(100)); // this also returns null
		//t.add("shiva"); // we will get an exception because we can't store String in this treeset because we are having integer type already in treeset now if we store string it cannot make comparisons.
		t.add(10.90);
		TreeSet y= new TreeSet();
		y.add("shiva");
		y.add("srikanth");
		System.out.println(y);
		
	}
}
