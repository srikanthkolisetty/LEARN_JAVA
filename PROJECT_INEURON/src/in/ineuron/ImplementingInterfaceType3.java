package in.ineuron;

@FunctionalInterface // interface said to be functional if it is having only one abstract method
interface Ifunc
{
	void m4();
	
	// void m5(); //line gives error if we remove comments because only one abstract method allowed.
}

/*
 *  when we try to add one more method to above interface it gives error
 *  because the interface is annotated with annotation saying @FunctionalInterface
 *  Lambda expression can be written only if the interface is functional interface
 */

// the functional interface can be implemented traditionally and also by using lambda expression.
class DoImpl implements Ifunc
{
	public void m4() //public specifier is must because while overriding visibilty should not be decreased.
	{
		System.out.println("another m4");
	}
	
}
public class ImplementingInterfaceType3 {

	public static void main(String[] args) {
		
		Ifunc f=()->System.out.println("lambda expression");
		f.m4(); //gives the output as lambda expression
		
	}
}
