package in.ineuron;

public class RemoveDuplicateCharacters {
		public static void main(String args[])
		{
			
			// treating data as case sensitive only no toUpper or toLower conversions
			String s="ShivaSrikanth";
			String sdupe="";
			for(int i=0;i<s.length();i++)
			{
				if( sdupe.indexOf(s.charAt(i)) == -1)
				{
					sdupe+=s.charAt(i);
			
				}
			}
			System.out.println("string without duplicates "+sdupe);
		}
}
