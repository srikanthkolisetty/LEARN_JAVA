package in.ineuron;
import java.util.Scanner;
public class Binary {
	static public void main(String[] args)
	{
		int a[]= {80,70,60,50,40},beg=0,end=a.length-1,sear;
		boolean flag=false;
		
		System.out.println("Enter the value to be searched");
		Scanner s=new Scanner(System.in);
		sear=s.nextInt();
//		for(int i=0,j=0; i<7;i++)
//		{
//			
//		} we can declare and initialize two variables in for loop
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			if(a[mid]==sear)
				{
				System.out.println("found at position "+mid);
				flag=true;
				break;
				}
			else if(a[mid]<sear) end=mid-1;
		
			else if(a[mid]>sear) beg=mid+1;
		
		}
		if (flag==false) System.out.print("element not found");
	}
}
