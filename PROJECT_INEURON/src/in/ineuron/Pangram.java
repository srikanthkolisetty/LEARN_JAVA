package in.ineuron;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[26]; // here it is not instance variable but also the array contains the default value.
		boolean flag=false;
//		for(int i:a)
//			System.out.println(i); // prints zeros
		String s = "abcd efgh ijkl mnop rst uvw xyz";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{	
			int temp=s.charAt(i);
			if(temp>=97 && temp<=122)
			a[s.charAt(i)-97]+=1;
			
		}
		
		for(int i:a)
		{
			if(i==0)
			{
				flag=true;
				System.out.println("not pangram");
				break;
			}
		}
		
		if(!flag) System.out.println("it is pangram");
			
		

	}

}
