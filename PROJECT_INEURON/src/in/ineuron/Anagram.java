package in.ineuron;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
	
		String s1="throw";
		String s2="worth";
		char []c=s1.toCharArray();
		char[] d=s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d))
			System.out.println("Its a anagram");
		else	System.out.println("not an anagram");
		
		
	}

}
