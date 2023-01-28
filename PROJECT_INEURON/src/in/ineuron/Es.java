package in.ineuron;

public class Es {
	static int a;
	void m2()
	{
		a=10;
	}

	void m3()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Es d=new Es();
		d.m2();
		d.m3();
	}
}
