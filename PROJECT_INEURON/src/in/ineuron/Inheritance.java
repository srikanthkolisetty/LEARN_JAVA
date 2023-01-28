package in.ineuron;

class Human{
	int i=10;
	public void display() {
		System.out.println("this is display method");
	}
}


public class Inheritance extends Human {

	int i=20;
	int h=super.i;  // super is used to overcome the shadowing problem.
	public void display() // in this method signature if we write the specifier which may decrease the visibility then it gives an error
	{
		System.out.println("this is child display method");
	}
	
	public static void main(String[] args) {
		
		Inheritance i= new Inheritance();
		i.display();
		//super.display(); // can't access the variables because super can't be used in static context
//		int d=super.i;
//		this.i=i;
//		
		
	}

}
// while overriding a method the return type , the no of parameters should be same as the method in the parent class if not it becomes into the concept of overrloading.
