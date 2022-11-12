package in.ineuron;

class Example{
	void add(float a,float b) {
		System.out.print(a+b);
	}
	float add(int a,float b) {
	
		return a+b;
	}
}



public class Metho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example for method ambiguity for compiler in method overloading confusion
		
		Example e=new Example();
		System.out.print(e.add(10, 20));
		

	}

}
