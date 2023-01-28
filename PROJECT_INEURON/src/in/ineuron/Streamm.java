package in.ineuron;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
public class Streamm {

	public static void main(String[] args) {
		
		ArrayList<Integer>a= new ArrayList();
		a.add(10);
		a.add(30);
		a.add(40);
		a.add(255);
		
		List<Integer>b=a.stream().filter(i->{if(i>10) return true; else return false;}).collect(Collectors.toList());
		
		List<Integer>d=a.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(d);
		System.out.println(a.stream().map(i->i*2).count());
		long e=a.stream().map(i->i*2).count(); // count method return type is long.
		System.out.println(e);
		Object[] obj=a.stream().sorted().toArray();
		for(Object t:obj)
		{
			System.out.println("for loop"+t);
		}	
		System.out.println(b);
		long g=a.stream().reduce(0,(ans,i)->ans=ans+i);// 0 is the default value of ans, ans is called as accumulator.
		System.out.println(g);
		a.stream().mapToInt(i->i).count();
		Double p=a.stream().mapToInt(i->i).average().getAsDouble();
		System.out.println(p);
		
	}
		
}