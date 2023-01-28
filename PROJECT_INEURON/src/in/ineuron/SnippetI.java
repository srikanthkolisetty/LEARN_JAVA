package in.ineuron;

interface Iy
{
	String s="a"; //by default static final is applied
	void method1(); // by default public abstract is applied
}
interface Ib
{
	
}
interface Ic extends Iy,Ib
{
	void method1();
	void method1(int a);
}
class H implements Ic
{
	public void method1()
	{
		System.out.println("hi");
	}
	public void method1(int a)
	{
		
	}
	//both methods should write.
}
interface Ibo
{
	boolean equals(Object obj);
}
public class SnippetI implements Ibo{

	public static void main(String[] args) {
		System.out.println("main");
		
		/* although we have implemented Ibo we have not provided implementation for equals() method
		*and even we have not provided we not got any error because the implementaion of that is present in the parent 
		*class of SnippetI which will inherit it and the parent class is Object class. 
		*
		*/
		
	}
}
