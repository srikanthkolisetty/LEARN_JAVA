package in.ineuron;

public class SelectionSort {
		
	public void sort(int[]a,int n)
	{
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	
	// In this sorting teechnique the smallest element will be come to the respective position
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]=new int[]{1,3,2,7,6};
			SelectionSort s=new SelectionSort();
			s.sort(a,a.length);
			for(int e:a)
			{
				System.out.println(e);
			}
	}

}
