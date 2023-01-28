package in.ineuron;
import java.util.function.Function;
@FunctionalInterface
interface IH
{
	void m2(int a);
}
public class MethodRef {

	private int m3(int a)
	{
		System.out.println(a);
		return a;
	}
	private String m4(Integer w)
	{
		return w.toString();
	}
	public static void main(String[] args) {
		
		IH h=new MethodRef()::m3;
		h.m2(19);
		Function<Integer,String> k=new MethodRef()::m4;
		System.out.println(k.apply(29));
	}
}
