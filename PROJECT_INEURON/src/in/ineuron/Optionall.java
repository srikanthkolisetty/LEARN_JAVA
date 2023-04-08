package in.ineuron;

import java.util.Optional;

public class Optionall {

	public Optionall()
	{
		System.out.println("object");
	}
	public static void main(String[] args) {
		
		Optional<Optionall> op=Optional.empty();
//		System.out.println(op.get()); this gives NoSuchElementException
		Optional<Optionall> op2=Optional.of(new Optionall());
	//	Optional<Optionall> op3=Optional.of(null);
		Optionall op6=(Optionall)Optional.ofNullable(new Optionall()).orElse(new Optionall());
		Optionall op7=(Optionall)Optional.ofNullable(new Optionall()).orElseGet(()->new Optionall());
		System.out.println(op6);
				
		
	}
}
