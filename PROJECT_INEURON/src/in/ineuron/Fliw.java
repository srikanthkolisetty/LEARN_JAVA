package in.ineuron;
class Flow{
	int a;
	{
		System.out.println(a);
		System.out.println("in parent java block");
	}
	Flow()
	{
		System.out.println("parent con");
	}
	
	
}
public class Fliw extends Flow{

	public static void main(String[] args) {
		
		Fliw d= new Fliw(); 
		// super(),java block , constructorbody , instance variables default value and memory allocation will be done 
		// only if object ius created.
	}
}
