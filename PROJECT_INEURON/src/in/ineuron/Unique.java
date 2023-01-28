package in.ineuron;
import java.util.Scanner;
public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ShivaSrikanth";
		String sdupe="";
		boolean flag=true; // default value is false if it is instance variable.
		System.out.println("enter data");
		Scanner sw= new Scanner(System.in);
		String ss=sw.next();
		System.out.println(ss);
		for(int i=0;i<s.length();i++)
		{
			if( sdupe.indexOf(s.charAt(i)) == -1)
				sdupe+=s.charAt(i);	
			else
			{
				flag=false;
			System.out.println("The string does not contain unique characters");
			break;
			}
		}
			if(flag)
			{
				System.out.println("the string contains unique characters");
			}
		}	
		

	}


