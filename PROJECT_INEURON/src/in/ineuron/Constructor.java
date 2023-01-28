package in.ineuron;

public class Constructor {
	
	int a;
	int b;
	
	public Constructor(int a) {
		
		this(10,20);
		this.a=a;
		//this(10,20) // this line gives error because this() should be in first line
	}
	public Constructor(int a,int b)
	{	
		
		this("shiva");
		this.a=a;
		this.b=b;
	}
	public Constructor(String shiva)
	{
		System.out.println(shiva); // in this constructor internally super() will be called
		
	}
	public static void main(String args[])
	{
		Constructor c= new Constructor(30); 
		int [] n= {1};
		String[] a= {"shiva","parvathi"};
		char[] s=a[0].toCharArray();
		System.out.println(s); // prints shiva
		System.out.println(n); // prints [I@.. object 		
		System.out.println(s+" "+n); // here it prints the hash code for both objects because the method called for this parameters is different
		System.out.println(a[0].toCharArray()) ;// returns a character array object prints shiva
		/*
		 * calling one constructor within other constructor is called as constructor chaining
		 * 
		 * The above difference in printing the array objects is because the println() method  behaves 
		 * differently for char array i.e it will not call the toString() method when an object of char type is passed
		 */
		
	}
}
