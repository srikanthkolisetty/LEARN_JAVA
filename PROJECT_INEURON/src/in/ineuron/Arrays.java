package in.ineuron;

class Fan{
 int wings;
 int speed;
}

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0; //valid
		//int i,intj;//invalid
		//int i,Boolean b=true; // invalid when comma is used we should not specify data type.
		Fan[] a=new Fan[3]; // a is an array of type Fan which stores the objects.
		int[] b=new int[3];
		int[] c=new int[] {1,2,3}; // this type of syntax is also valid where we can initialize the values of array at the time of declaration.
		
		a[0]=new Fan();
		for(Fan d:a)
		{
			System.out.println(d);
		}
		for(;;) {
			System.out.println("true");
		}// when no condition is specified compiler will keep the value as true
	
	}
// array disadvantage is it can store homogeneous types, only continuous memory location, fixed size of array
	
}
