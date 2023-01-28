package in.ineuron;

public class MethodOverloadingVar2 {
	
	public void m1(Long g)
	{
			System.out.println("Inside long wrapper");
	}
	public void m1(Number g)
	{
		System.out.println("In number");
	}
	public void m1(int ...g)
	{
		System.out.println("in var args");
	}
public static void main(String[] args) {
	
	MethodOverloadingVar2 t=new MethodOverloadingVar2();
		t.m1(2); //compile time error  because 
		/*
		 * first primitive type casting m1(int arg) if it not present then so checks for m1(long arg) 
		 * if both are not present then autoboxing now checks for m1(Integer arg)
		 * if this also not present now then checks for widening in terms of objects
		 * Type casting in terms of objects can be done between child and parent only.
		 *  Now for Integer type casting will be Number as Number is parent class
		 *  m1(Number arg) if it not present 
		 *  then at last m1(int ... args) if it not present then checks for m1(Object o) it is not 
		 * present  so compile time error.
		 * 
		 * 
		 */
		StringBuilder se=new StringBuilder("build");
		String s=new String(se);
}
}
