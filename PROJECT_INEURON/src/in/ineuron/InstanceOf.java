package in.ineuron;

interface IC
{
	
}
class EEE
{
	
}
public class InstanceOf {
	int [] []a[],b[]; // a is three dimensional and b is also three dimensional array.
	public static void main(String[] args) {
		
		System.out.println(new InstanceOf() instanceof IC);
		System.out.println(new InstanceOf() instanceof EEE);// gives error
	
		System.out.println(a);
	}
}
