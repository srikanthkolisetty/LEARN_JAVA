package in.ineuron;


class Parentt{
	protected int name,age;
	public Parentt()
	{
		
	}
	public Parentt(int name)
	{
		this.name=name;
	}
}
public class Inheri2 extends Parentt {

	int name;
	public Inheri2(int name)
	{           // here super() is not needed because a constructor with out parameters is present if that constructor is not present then we should make a explicit call to the parameterized constructor.
		super(name);
		this.name=name;
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		Inheri2 n= new Inheri2(1);
	}
	
}
