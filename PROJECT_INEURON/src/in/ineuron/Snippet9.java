package in.ineuron;
class Foo
{
	int a=10;
}
public class Snippet9 extends Foo{

	int a=19;
	int b=20;
	Integer i=10;
	public void m3(Integer o)
	{
		System.out.println("o");
	}
	public void m4(int p)
	{
		System.out.println("p");
	}
	public static void main(String[] args) {
		
		Foo s= new Snippet9();
		//System.out.println(s.b); // error 
	Snippet9 j= new Snippet9();
	  j.m3(12); // autoboxing
	  Integer h=19;
	  j.m4(h);
	}
	
}
