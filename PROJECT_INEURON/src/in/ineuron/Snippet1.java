package in.ineuron;

public class Snippet1 {

	public static void main(String[] args) {
		int a=3;
		System.out.println((a++==3 || --a==3 )&& --a==3);
		System.out.println(a);//output:3
		a=3;
		System.out.println(a++==3 || --a==3 && --a==3); 
		System.out.println(a);//output:4
		a=3;
		System.out.println(++a==3 || --a==3 && --a==3);  // internally treated as (++a==) || (--a==3 && --a==3) this is the default behaviour
		System.out.println(a);//output:2
	}
	/*
	 * in line 8 the left of short circuit (or) || operator is treated as o 
	 * 
	 */
}
