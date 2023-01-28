package in.ineuron;
import java.util.function.Predicate;

class Pree implements Predicate<Integer>
{
	public boolean test(Integer a)
	{
		if(a%2==0) return true;
		else return false;
	}
}


public class PredicateInterfacee {

	public boolean m2(Integer a)
	{
		System.out.println(a);
		return a%2==0;
	}
	
	public static void main(String[] args) {
		// for an interface an anonymous inner class can be written
		// for an inteerface an if it is functional then we can write lambda expression or method reference
		// we can follow the standard approach
		
		
		Predicate<Integer> p=new PredicateInterfacee()::m2;
		System.out.println(p.test(2));
		Predicate<Integer> p1=i->{if(i>3) return true; else return false; };
		
		System.out.println(p.negate().test(2));
		System.out.println(p.and(p1).test(3));
		System.out.println(p.or(p1).test(4));
	}
}
