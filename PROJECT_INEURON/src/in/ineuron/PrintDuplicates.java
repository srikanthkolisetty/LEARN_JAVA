package in.ineuron;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// treating data as case sensitive only no toUpper or toLower conversions
		String s="ShivaSrikanth";
		String sdupe="";
		for(int i=0;i<s.length();i++)
		{
			if( sdupe.indexOf(s.charAt(i)) == -1)
				sdupe+=s.charAt(i);	
			else
				System.out.print(s.charAt(i));
		}	
		
	}

	}


