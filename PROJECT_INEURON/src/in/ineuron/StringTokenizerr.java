package in.ineuron;
import java.util.StringTokenizer;
public class StringTokenizerr {

	public static void main(String[] args) {
		
		StringTokenizer t= new StringTokenizer("Shiva srikanth parvathidevi");
		int count=t.countTokens();
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken());
		}
		StringTokenizer t2= new StringTokenizer("Shiva@Srikanth@Ganessh","@"); // overloaded constructor
		int count2=t2.countTokens();
		System.out.println(count2);
		while(t2.hasMoreTokens())
		{
			System.out.println(t2.nextToken("@"));
		}
		
	}
}
