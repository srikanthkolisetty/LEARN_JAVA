package in.ineuron;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	public Employee(String name)
	{
		
	}
	public int mapO(Object i)
	{
		return ((int)i)*2;
	}
	public static void main(String[] args) {
		
		Employee[] ar= {
				new Employee("shiva"),new Employee("srikanth"),new Employee("ganesh")
		};
		List<Employee> e= Arrays.asList(ar);
		
		Stream<Integer> s =Stream.of(1,2,4,4);
		s.forEach(System.out::println);
		Long g=Stream.of(12,2,3).count();
		System.out.println(g);
		// once stream is closed we can't perform operation on it again
//		s.map(new Employee("parvathimatha")::mapO).collect(Collectors.toList());
		Integer o=Stream.of(-1,-2,-4,-5).filter(r->r>0).findFirst().orElse(3);
		System.out.println(o);
//		Integer[] t = s.toArray(Integer[]:: new);
		List<List<Integer>> t2=List.of(List.of(1,2,3,4,45,3),List.of(1,2,3,4,44,3));
	List<Integer>r=	t2.parallelStream().flatMap(mapper->mapper.stream()).collect(Collectors.toList());
		System.out.println(r);
		Stream.of(1,2,43).skip(2).limit(2).forEach(System.out::println);
		Stream.of(1,23,3).map(pp-> pp+" ").collect(Collectors.joining(",")).toString();
		
		Map<Boolean,List<Integer>> i =Stream.of(1,2,3,4,5).collect(Collectors.partitioningBy(u->u%2==0));
		System.out.println(i);
		
	}
}
