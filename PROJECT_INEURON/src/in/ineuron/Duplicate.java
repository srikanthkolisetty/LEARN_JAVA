package in.ineuron;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {1,2,5,3,4,1,2};
		for(int j=0;j<i.length;j++)
		{
			for(int k=j+1;k<i.length;k++)
			{
				if(i[j]==i[k])
				{
					System.out.println(i[k]+" is a duplicate element");
				}
			}
		}

	}

}
