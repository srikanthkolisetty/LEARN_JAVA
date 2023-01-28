package in.ineuron;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="2552"; // Inside the object the string data is stored as collection of character array only.
			boolean flag=true;
			int n=s.length();
			for(int i=0;i<n;i++)
			{
				if(!(s.charAt(i)==s.charAt(n-i-1)))
				{
					flag=false;
					System.out.println("It's not a palindrome");
					break;
				}	
			}
			if(flag==true)
			System.out.println("it's a palindrome");
	}
}
