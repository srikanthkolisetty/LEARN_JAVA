package in.ineuron;
import java.util.Arrays;
import java.util.List;

public class ArraysList {
public static void main(String[] args) {
	Object s[]= {"hi","hello"};
	List<Object> a=Arrays.asList(s);
	a.forEach(System.out::println);
	a.set(1, "op"); 
	a.remove(1);
}
}
