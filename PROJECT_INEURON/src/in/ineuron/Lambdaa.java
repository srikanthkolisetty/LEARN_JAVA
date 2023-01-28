package in.ineuron;

@FunctionalInterface
interface Imp{
	void check(int num); // by default public abstract
}

public class Lambdaa {
		
	Imp o; // reference type of any will store null as default only.
	public static void main(String[] args) {
		Imp p=n->{
			System.out.println("l");
		};
		Imp s=n->
		{
			System.out.println("top");
		};
		s.check(1);
		Lambdaa l= new Lambdaa();
		System.out.println(l.o);
	}
	}
