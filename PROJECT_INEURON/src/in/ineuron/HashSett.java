package in.ineuron;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSett {
public static void main(String[] args) {
	HashSet s= new HashSet();
	s.add(null);
	s.add("shiva");
	s.add("shiva"); // duplicates will not be reflected into the result.
	System.out.println(s);
	LinkedHashSet h= new LinkedHashSet();
	h.add(null);
	System.out.println(h);
// HashSet and LInkedHashSet also don't have index based accessing.
	
	//Integer i= Integer.parseInt("sa"); // number format exception
	Integer r= Integer.valueOf("1");
	
	/*
	 * 
	 * parseInt returns primitive type
	 * valueOf returns Integer Object
	 */
	
}
}
