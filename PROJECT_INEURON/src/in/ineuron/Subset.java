package in.ineuron;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,10};
		int b[]= {1,3,2};
		// to check whether b and c arrays are subset of a or not.
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==b[i]) 
					{
						flag=true;
						break;
					}
			}
			if (flag==false) {
				System.out.print("not subset");
				break;
			}
			if(i==b.length-1)	System.out.print("it is subset");
			
		}

	}

}
