
package in.ineuron;

public class Unboxing {
	
	public void m1(int ... x)
	{
		System.out.println("in var args");
	}
	public void m1(int a)
	{
		System.out.println("one arg method m1");
	}
	
	public void m1()
	{
		System.out.println("empty");
	}
	public void m2(int x,int y, int ... z)
	{
		System.out.println("var arg at last"+z);
		for(int r:z)
		{
			System.out.println(r);
		}// this is for each loop or can also be called as enhanced loop.
		
	}
	public void m3(int f, float ...x)
	{
		System.out.println("float var args"+x); // as x is array object address will be printed.
	}
	// we can have any number of arguments but if we want to specify var args with other arguments var arg should be at last.
	
	static Integer i;
	public static void main(String[] args) {
		
		int[] a=new int[] {}; // empty array object.
		
		//int i2=i; //null pointer exception but not compile  time error
		Integer i3=new Integer(19); // from higher versions of jdk this constructor method gets deprecated.
		Integer i4=10; // uses of valueOf method autoboxing
		Integer i5=10; // uses valueOf() method autoboxing
		System.out.println(i4==i5); // true
		System.out.println(i3==i4); //false
		Integer i6=129;
		Integer i9=129;
		System.out.println(i6==i9);// false not in buffer range -128 to 127 two new objects will be created
		/*
		 * 
		 * Buffer concept only for wrapper that to except double and float wrapper class
		 * for boolean true and fasle values in buffer size object will be stored.
		 * If needed object is not present in the buffer of objects new object will
		 * be created in heap.Not in buffer 
		 * If it is present in buffer then it makes use of that.
		 * 
		 * 
		 */
		
		Boolean b=Boolean.valueOf("true"); // valueOf() method can accept same as constructor but this is intelligent one.
 		Integer aq=Integer.valueOf("10");
		System.out.println(b);
		Unboxing ja=new Unboxing();
		ja.m1(12);
		if(b) // here automatic conversion from wrapper to primitive happens
		{
			System.out.println("in if");
		}
		
		ja.m2(1, 2, 1,2,3,4);
		ja.m3(1, 1.2f,1.3f);
		ja.m3(2, new float[]{1.2f,1.5f}); // var args can accept array and multiple values also 
		// when var args accept multiple values it internally store in the array only.
		ja.m1(2); // m1 with one argument method will be called.
		ja.m1();// m1 method with var args will be called and an empty object will be created if no empty method there.
	
	
	// but here m1() is present which does not accept any arguments so this method will be called.
		
		
		
	}
}
