package in.ineuron;

import java.io.*;
interface IYou
{
	void me();
}
abstract class Mm implements IYou
{
	abstract void f3();
}
abstract class Oneee
{
	
}
public class Doubt2 extends Mm {

	public void me()
	{
		System.out.println("hi");
	}

	void f3() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws IOException {
		
		System.out.println("hi");
//		try {}
//		catch(IOException e)
//		{
//			
//		} if there is no checked exception being raised then we should not specify it catch (for checked exceptions)
	}
}
