package in.ineuron.First;

public class SpringLove {
	
	private int one;
	private int two;
	private int three;
	public SpringLove(int one , int two)
	{
		this.one=one;
		this.two =two;
	}
	
	public void iamMethod()
	{
		System.out.println(one+" "+two+" "+three);
	}
	
	public void setThree(int temp) {
		three= temp;
	}
}
