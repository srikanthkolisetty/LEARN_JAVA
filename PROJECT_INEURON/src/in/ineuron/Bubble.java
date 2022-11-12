package in.ineuron;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {7,10,1,2,3};
			for(int i=0;i<a.length;i++)
			{
				for(int j=1;j<a.length-i;j++)
				{
					if(a[j]<a[j-1])
					{
						int temp=a[j];
						a[j]=a[j-1];
						a[j-1]=temp;
					}
				}
			}
			for(int d:a)
			{
				System.out.println(d);
			}
	}

}
