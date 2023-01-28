package in.ineuron;

public class Code_snippet4 {
	public static void main(String[] args) {
		
		
		String s="shiva";
		final Integer s1=1; // compiler will not come to know the values for wrapper class objects even if they are declared as final
		String s2="shiva"+1;
		String s3=s+s1;
		String s4="shiva"+s1;
		System.out.println(s4==s2);
		String d="shiva_parvathi_ganesha_";
		String[] f=d.split("_",3); // the second argument specifies the information about the resultant array 
		for(String e:f)
			System.out.println(e);
		{
			
			System.out.println(s4);	
		}	
		System.out.println(s.replace("sh", "shi"));
	}
}
