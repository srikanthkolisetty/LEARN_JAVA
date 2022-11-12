package in.ineuron;

public class Hands {

	public static void main(String[] args) {
		int x=10;
		l1:{
				
				if(x==10)	break l1;
				System.out.println("inside block which is having name l1");
			
			}
		// break can be used inside labelled block,loop, and in switch case.
		
	// break is used to throw the flow of execution from its current loop and now if i want to throw for outer loop even then we can use labelled blocks
		
	l2:for(int i=0;i<5;i++)
	{
		l3:for(int j=0;j<5;j++)
		{
			if (i==j) break l2; // in this break it not only comes out of inside loop, it comes out of the outer loop even. This is the one of the advantage of labelling
			
			System.out.println(i);
		}
	}
	
	}
}
