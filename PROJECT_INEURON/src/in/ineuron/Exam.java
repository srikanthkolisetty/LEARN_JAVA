package in.ineuron;

class E{
	static int a;
	int b;
	public static void E2()
	{
		System.out.println(a);
	}
	public void E3()
	{
		System.out.println(b);
	}
}
public class Exam extends E{

	public static void main(String[] args) {
		E.a=10;
		E.E2();
		E e= new E();
		e.E2();
		Exam r= new Exam();
		r.a=19;
		r.b=18;
		e.E2();
		r.E3();// as a is static variable once its value changes it is same for all.Not the same with instance variables.
		Exam t= new Exam();
		t.b=10;
		t.E3();
	}
}
