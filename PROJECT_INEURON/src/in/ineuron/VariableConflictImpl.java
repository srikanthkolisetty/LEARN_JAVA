package in.ineuron;



// tip : nesting of operators will not work
interface Iu{
	int x=10;
}
interface Ih{
	int x=89;
}
public class VariableConflictImpl implements Iu,Ih {

	int a=10;
	public static void main(String[] args) {
		System.out.println(Iu.x);
		System.out.println(Ih.x);
		// for this no errors like method and this is the way that we can access the variables of interfaces.
		
	}
	
}
