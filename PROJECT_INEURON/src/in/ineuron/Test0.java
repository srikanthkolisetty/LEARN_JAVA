package in.ineuron;

public class Test0 {
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,'a'};
		int k='a';
		StringBuffer r=new StringBuffer("www");
		String n= new String(r); // allowed it can accept byte array, char array even.
		byte[]e= {1,3,4,2};
		char q[]= {'a','p'};
		String w=new String(e); // can accept byte array

		String w1=new String(q);
		System.out.println("ww"+w+n+w1);
		
		
	//	char g=k; // error because as we are assigning int variable compiler don't know the value when it don't know the value it just check type checking.;
		byte b=98;
		char cd='o';
		char c[]= {98,cd}; // int can be converted to char but not byte. We can assign a variable to index and the value of that variable gets stored.
		Test0 t=new Test0();
		for(char d:c)
		{
			System.out.println(d);
		}
		System.out.print(t.addSum(a));
		if(true)
		{
			
		}
		else
		{
			System.out.println("l"); // no error but compiler gives a warning as dead code.
		}
	}
	
	int addSum(int[]a)
	{
		int sum=0;
		for(int c:a)
		{
			sum+=c;
		}
//	
//	for(int i=0;i<3;i++)
//	{
//		continue;
//		System.out.println("hi"); //unreachable code error
//	}
	return sum;
}
}