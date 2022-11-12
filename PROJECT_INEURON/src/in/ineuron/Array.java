package in.ineuron;
import java.util.*;
public class Array {

	public static void main(String[] args) 
	{
		//
		// TODO Auto-generated method stub
		System.out.println("enter the size of the array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n);
		
		int []ar=new int[n];
		System.out.println("default value"+ar[0]);
		for(int w=0;w<ar.length;w++)
		{
			System.out.println("enter the value for position"+ w);
			ar[w]=s.nextInt();
		}
		System.out.println(ar);
	}

}
