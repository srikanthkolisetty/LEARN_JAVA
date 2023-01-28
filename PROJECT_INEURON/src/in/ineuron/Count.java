package in.ineuron;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String vowels="aeiou";
		String s="shiv a@";
		s=s.toLowerCase();
		System.out.println(s);
		int vCount=0,cCount=0,sCount=0;
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			if(vowels.indexOf(temp)!=-1)
				vCount+=1;
			else if(temp>=97 && temp<=122)
				cCount+=1;
			else if(!(temp<9||temp!=' '))
				sCount+=1;
		}
		System.out.println("Vowels,constants,specialchars"+vCount+" "+cCount+" "+sCount);
		
	}

}
