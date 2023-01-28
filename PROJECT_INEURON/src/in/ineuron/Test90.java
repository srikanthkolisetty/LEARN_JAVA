package in.ineuron;

public class Test90 {
	
	int a=10;
	static int b=10;
	public void test() {
		a=20; // changes made here direclty change the value inside it 
		b=30; // static variables can be accessed any where and can be modified also.
	}
	public void disp() {
		System.out.println(a); // we get the modified value here  
	}// java is a case sensitive
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test90 n=new Test90();
		n.test();
		n.disp();
	}

}
