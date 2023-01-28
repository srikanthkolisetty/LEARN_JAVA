package in.ineuron;

class Bar
{
	int a=10;
	void addFive()
	{
		a+=1;
	}
}
public class Exe extends Bar{

//	int a=12;
	public void addFive()
	{
		a+=1; // super s class a instance variable and we make use of super keyword only when we have shadowing problem.
		System.out.println(this.a);
	}
	public void add()
	{
		a+=1; // above class instance and static variable can be accessed based on there visibilty.
	}
	
	public static void main(String[] args) {
	
	Bar r=new Exe();
	r.addFive();
	System.out.println(r.a); // 11 because only method overidding concept is there not variable overidding 
	// foo type a variable will be accessed.
}
}
