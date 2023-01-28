package in.ineuron;

class Parent
{
	int x,y;
	static int z;
	{
		System.out.println("Inside the instance block of parent");
	}
	public Parent()
	{
		System.out.println("currently in parent class constructor");
		x=122;
		y=33;
		z=20; // static variables can be accessed any where 
	}
}

public class Stack extends Parent {

	int i,j;
	static int k; // static variable will also have a default value, memory allocated in heap area only
	
	static {
		System.out.println("In static block");
		System.out.println("value of k is "+k);
		k=10; //static blocks are mainly used to initialize the static variables
	}
	static void display(Stack pa)
	{
		System.out.println(k);  
		//System.out.println(this.i); // this line gives an error saying cannot use this keyword in static context.
		System.out.println(pa.i); // using object we can access the non  static variables 
	}
	
	public Stack() {
		this(10,20); //calling currents class constructor
	}
	public Stack(int i,int j) {
		super();// calling parents class constructor
		System.out.println("current class constructor");
		this.i=i;
		this.j=j;
	}
	static {
		System.out.println("a class can have any no of static blocks and they gets executed based on the order");
	}
	{
		System.out.println("this is a normal java block and this gets executed before the constructor body gets executed");
		System.out.println("But after the super() method gets called then only this will be executed");
	
	}
	//java block will be executed after the super() call  or this call only, and then after the java block then the constructor remaining body gets executed
	public static void main(String args[])
	{
		Stack s=new Stack(100,200);
		Stack.display(s);
		display(s); // for static method calling a method from same class don't require class name to call the method.
		
	}
	
	
	
	
}
