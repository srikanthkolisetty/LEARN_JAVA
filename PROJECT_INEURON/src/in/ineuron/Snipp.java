package in.ineuron;
class Ja
{
	public void run()
	{
		System.out.println("run");
	}
}
public class Snipp extends Ja{
 public static void main(String[] args) {
	
	 Integer i=12;
	 int j=12;
	 System.out.println(i==j); // wrapper will be unwrapped and comparison happens b/w primitive and primitive
	 Snipp s= new Snipp();
	 if(s instanceof Ja)
	 {
		 System.out.println("yes");
	 }
 }
}
