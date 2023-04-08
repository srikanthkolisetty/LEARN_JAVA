package in.ineuron;

import java.util.List;
import java.util.*;
public class StreamY {

	public static void main(String[] args) {
		
		List<Integer> li=List.of(6,1,2,3,4,5);
	Object obj[]=li.stream().sorted().toArray();
//		Arrays.stream(obj).forEach(System.out::println);
	for(Object o:obj)
	{
		System.out.println(o);
	}
		
	List<Integer> li2=List.of(6,1,2,3,4,5,6);
	li2.stream().sorted().distinct().forEach(System.out::print);
	
	li2.parallelStream().forEach(System.out::println);
	li2.parallelStream().forEachOrdered(System.out::print);
	
	}
}
