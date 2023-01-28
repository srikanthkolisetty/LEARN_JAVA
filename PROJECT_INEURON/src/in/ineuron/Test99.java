package in.ineuron;

class Stud{
	static {
		System.out.println("static blocks in parent class");
	}
	// static variables and static blocks of parent class gets executed when  there is an object creation for its child class
}




public class Test99 extends Stud{
	public static void main(String []argss)
	{
		Test99 t= new Test99();
		System.out.println("main method of child class");
	}

}
