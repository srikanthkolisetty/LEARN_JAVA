package in.ineuron;

public class ArrSyn {

	public static void main(String[] args) {
		// let us see the different types of syntaxes 
		
		int [][] a[],b[]; 
		char [] [] c,d[]; // c-two dimensional array, d-three dimensional array
		// double [][] e[],[]f;// wrong syntax []f this should be as => f[] double [][] this will be applied to both arrays.
		
		int r[]= {1,2,3,4};
		for(int e:r) // enhanced for loop, we cannot have access to the index 
		{
			System.out.println(e);
		}
		// we will have a doubt i.e how object is creating for arrays based on types specified it is because developers internally written the code
		
		char [] g= {'t'};
		System.out.print(g.getClass()); //output for this statement is " class [c  " these classes will be available at runtime.
	 
		// char a value in int is 97
		// the size of array can be int,char,byte,short but not otheer data types.
		byte u=10;
		char[] t= new char[u]; // u is of type byte.
	
	}

}
