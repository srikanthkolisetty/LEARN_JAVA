package in.ineuron;

public class CodeSnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		boolean flag=false;
		boolean flag2=true;
		if(a++==3 || --a==3 && --a==3)
		{
			System.out.println("true"+a);
		}
		else
		{
			System.out.println("p"+a);
		}
// output will be true and 4 which is a value () paranthesis is not specified so execution takes place sequentially only. As the operator being used there is shortcircuit or operator if one side operand(left side) is true then the other side will not be executed.
		System.out.println((flag=false)| (flag=true) || (flag=false));
		System.out.println((flag=true) || (flag=false));
		System.out.println(flag); // true
		System.out.println((flag=true)| (flag=false) || (flag=false));
		System.out.println(flag); // output for this is false
		System.out.println(flag=false || flag==true); // first value for flag will be false false||false => false and then false==true results false.
//		System.out.println(flag=false || flag=true); // error because the result for shortcircuit operator is false and then false=false is a wrong assignment statement so that only it is giving error.
		
		System.out.println(flag=flag2!=true); // here assignment operator that means right side one should be completely evaluated it is lke a=2*33*3 here directly 2 will not be allocated instead the result of the expression will be stored.
		System.out.println(flag);
		if(false)
		{
			System.out.println("ji");
		}
		
	}

}
