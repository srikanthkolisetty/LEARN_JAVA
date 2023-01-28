package in.ineuron;

class Parents{
	public void god()
	{
		System.out.println("In the parent");
	}
}


public class DownCasting extends Parents{
	int t=10;
	public void god()
	{	
		super.god(); // we can call the parent class methods even.
		System.out.println("In the child god");
	}
	
	public void rock()  // child class specialized method
	{
		System.out.println("in the rock");
		god(); // instance method can be called inside a instance method with out using a object.
	}
	static void me() {
		System.out.println("l");
		System.out.println(new DownCasting().t); // we can access instance variables using object
	}
	
	public static void main(String[] args)
	{
		
		//[]int a;
		Parents p= new DownCasting();
		((DownCasting)p).rock(); // this is called as downcasting
		int i=2;
		do
			while(i<=2)
			{
				System.out.println("hi");
			}
		while(i==2);
	}
}

