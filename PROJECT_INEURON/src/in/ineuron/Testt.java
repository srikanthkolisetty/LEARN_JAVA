package in.ineuron;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		while(a<b) {
			System.out.println("k");
		}

		System.out.println("kk"); // generally by looking above code we can say this is as unreachable code which usually the compiler should find and gives an error.
		/* but no compiler does not gives error because in the above while condition literals are not used and expression with variables are used so compiler just checks syntax,and outcome type that's it , it shuts it mouth and checks other statements 
		 * . compiler will think extra only when literals are involved.*/
		 */
	}

}
