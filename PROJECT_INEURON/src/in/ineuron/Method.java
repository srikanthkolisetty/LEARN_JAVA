package in.ineuron;

public class Method {
	static public void main(String [] args) {
		Method m=new Method();
		m.main(2,3);
	}
	// we can overload a main method in java, still jvm calls the main method defined in it. 
	public void main(int a ,int b) {
		System.out.println(a+b);
	}

}
