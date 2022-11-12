package in.ineuron;

public class MergeSort {

	public void mergeSort(int []a,int n)
	{
		if(n<2)  // when an array size is one then we no need to divide and sort
			return;
		int mid=n/2;
		int l[]=new int[mid];
		int r[]=new int[n-mid];
		for(int i=0;i<mid;i++)
			l[i]=a[i];
		for(int j=mid;j<n;j++)
			r[j-mid]=a[j];
		mergeSort(l,mid); // further dividing of left array
		mergeSort(r,n-mid); // further dividing of right array
		merge(a,l,r,mid,n-mid); // at last merging the array by comparing the left array and right array 
		
	}
	
	public void merge(int[]a,int[]l,int[]r,int lsize,int rsize )
	{
			int i=0,j=0,k=0;
			while(i<lsize && j<rsize)
			{
				if(l[i]<r[j])
					a[k++]=l[i++];
				else
					a[k++]=r[j++];
			}
			
			while(i<lsize)
				a[k++]=l[i++];
			while(j<rsize)
				a[k++]=r[j++];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[]a= {10,4,2,5,1,6,3};
				MergeSort m= new MergeSort();
				m.mergeSort(a,a.length); // passage of the array is by it self call by reference.
				for(int b:a)
					System.out.println(b);
	}

}
