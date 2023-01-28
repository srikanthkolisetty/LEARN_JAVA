package in.ineuron;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shivaawessdwwwddd";
		int max;
		char[] c=s.toCharArray();
		int freq[]=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')
			{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{	
					freq[i]+=1;
					c[j]='0';
				}
					
			}
		}
}
		max=freq[0];
		int index=-1;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max=freq[i];
				index=i;
			}
		}
		
		System.out.println("max char is "+c[index] +" and  occurence is "+ (max+1));
		
}}