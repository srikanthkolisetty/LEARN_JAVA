package in.ineuron;

public class Ex {
int a=10;
public void m1()
{
	a=20;
	m2();
}
public void m2()
{
	System.out.println(a);
}
public static void main(String[] args) {
	Ex e= new Ex();
	e.m1();
	int b=0;
	try{
		b=9;
	}
	catch(Exception d)
	{
		System.out.println("ok");
	}
	
//	{
//		System.out.println(b);
//	}
}
}
