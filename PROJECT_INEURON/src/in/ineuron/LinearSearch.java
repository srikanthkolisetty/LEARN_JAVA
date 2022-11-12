package in.ineuron;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// class name should be in pascal convention
		
		int n,a[],se,flag=0;
		System.out.print("enter the size of array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{	
			System.out.println("enter the value to be stored in a[i]");
			a[i]=s.nextInt();
		}
		System.out.println("enter the element that need to be searched in array");
		se=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==se)	{
				System.out.println("element found at index "+i);
				flag=1;
				break;
			}
		}
		if (flag==0) System.out.println("element not found in array");
		
	}

}
