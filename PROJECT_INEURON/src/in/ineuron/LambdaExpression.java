package in.ineuron;

@FunctionalInterface
interface Ilambda
{
	void met(int a,String h);
}
@FunctionalInterface
interface Inc
{
	int meet(int a);
}
public class LambdaExpression {

	Ilambda i=(int a,String h)->{
		System.out.println("hi");
	};
	{
		System.out.println(i);
		i.met(10,"k"); // calling the lambda expression
	}
	public static void main(String[] args) {
		LambdaExpression l= new LambdaExpression();
		Inc i=n->  //data type of parameter is optional and paranthesis also as we are having only one parameter.
		{
			return 1;
		};// here curly braces are needed although it is single statement because we are using return keyword
		Inc r=n->20; //We don't need to write return if there is a single statement then that statement result will be returned by default
		System.out.println(i.meet(12)+""+r.meet(12));
	}
	
}
