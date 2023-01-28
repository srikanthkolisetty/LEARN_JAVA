package in.ineuron;

public class snippet32 {
	public static void main(String[] args) {
		int x;
		if(args.length>0)
			x=10;
		//System.out.println(x); // this line gives compile time error because compiler is not guarantee about x value to be 10
	
/*
 * 
 * compiler is giving error because the x may not get the value and to use local variables those should have value definitely.
 * 
 * 
 */		int a=10,b=20;
		//byte c=(a<b)?30:40;
		byte h=10;
		byte r=(a<b)?30:h;
	
	int n[][]= {{1,3},{2,4}};
	for(int i=n.length-1;i>=0;i--)
	{
		for(int f:n[i])
			System.out.println(f);
	}
	
	int[][] arr =new int[2][4];
	arr[0] = new int[]{1,3,5,7};
	arr[1] = new int[]{1,3}; // here we are replacing with new object.
	for(int[] a : arr){
	for(int i:a){
	System.out.print(i+" " );
	}
	System.out.println();
	}
	
	
	
	
	
	
	}
}
