package in.ineuron;

class New{
	static {
		System.out.println("static");
	}
	public void newbie() {
		System.out.println("in the method");
	}
//	public New()
//	{
//		
//	}
}

public class RuntimeClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
		
		Class c=Class.forName(args[0]);
		Object o=c.newInstance();
		
		
		
	}
}
