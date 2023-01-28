package in.ineuron;

public class TwoDimeVar {

	
	public void m1(int[]...x) // now this is var arguments type only but it can accepts two dimensional array.
	{
		System.out.println(x);
		for(int[]a:x) {
			for(int b:a) {
				System.out.println(b);
			}
		}
	}
	

	
	public static void main(String[] args) {
		
		TwoDimeVar t=new TwoDimeVar();
		t.m1(new int[] {1,2,3},new int[] {1,2,1,1});
		t.m1(new int[] {6,6});
		
	}
	
	
}
