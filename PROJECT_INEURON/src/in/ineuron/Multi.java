package in.ineuron;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][][]= {{{10,20},{30}},{{40}},{{50}}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
		
		
		
	}

}
