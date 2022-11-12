package in.ineuron;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]=new int[2];
//		a= {1,3};
	//	int a[] = new int[2] {12,3};
		int x=0;
		do {
			 if (true) 
				 {
				 continue;
				// System.out.println("l");
				 }
			 System.out.println(x); // no error for unreachable 
			 x++;
		}while(x<2);
		
		if(true)
		{
			System.out.println("inside if");
		}
		else
		{
			System.out.println("l");
		}
		// unreachable statement only in case of loops.
		}

}
