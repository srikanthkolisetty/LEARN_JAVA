package in.ineuron;

class Pa
{
	public static void disp()
	{
		System.out.println("parent");
	}
}
public class MethodHiding extends Pa{

	//this method will not act as method overriding method this acts as specialized method.
	public static void disp()
	{
		System.out.println("child specialized");
	}
	
	public static void main(String[] args) {
		
		Pa k= new MethodHiding();
		k.disp(); //parent will be output as it can't access specialized method it takes method from parent
		
		((MethodHiding)k).disp(); //  child class method
		
		/* static methods do participate in inheritance but can't be overriden if we try to overriden it
		 * will not give any error but act as specialized method. 
		 */
		
		
}
}
