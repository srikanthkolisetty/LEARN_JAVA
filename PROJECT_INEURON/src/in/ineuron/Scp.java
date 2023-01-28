package in.ineuron;

public class Scp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("shiva"); // two objects will be created
		String s1=s.intern(); //getting reference of the object present in the scp.
		String s2="shiva"; //scp 
		System.out.println(s1==s2);//returns true if pointing to same object
		System.out.println(s.equals(s1)); // returns true if the content of two different objects are same.
		String s3="you"+"me"; // String s3="youme" this is how compiler send this line to jvm
		String s4="youme";
		System.out.println(s4==s3);
		char [] ch= {'j','a','v','a'};
		byte []a= {1,2}; // string can take byte and char array;
		String s5=new String(a); // also creates two objects scp,heap, like this we can pass stringbuffer variable,byte array variable and we can alsi create an empty string.
		System.out.println(s5);
		System.out.println(s5.length());
		System.out.println(s5.charAt(3)); //s5.charAt(-1) gives exception s5.charAt(500) gives exception known as StringIndexOutOfBoundsException
		int a[]=new int['a']; //size can be specified in char
		for(int i=0;i<3;i++)
		{	
			if(i<20)
		{
			continue;
		//	System.out.println("o"); // error unreachable code
		}
		
		}
		
		
		int count=0;
		for(int i=0;i<10;i++)
		{
			if(i==0)
			{
				continue;
				count++;
			}
		}
		int data[] = {2010,2013,2014,2015,2014};
		int key = 2014;

		//int count=0;
		for(int e:data){
		if(e!=key){
		continue;
		count++;
		}
		}
		System.out.println(count+" found");
		
		
		
		
		
		
		
		
		
		
		

}
}
