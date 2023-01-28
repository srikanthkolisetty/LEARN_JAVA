package in.ineuron;

class Based
{
	Based(String id)
	{
		System.out.println(id);
	}
}

public class Snippet0 extends Based{

	
	Snippet0(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public void B(String[]...a) //square brackets should be placed at starting only.
	{
		
	}
	public static void main(String[] args) {
		Based d= new Snippet0("o");
		Based s= new Based("l");
		Snippet0 p=(Snippet0)d;
		Snippet0 f=(Snippet0)s; //explicit casting only works and casting can be done if thereis relation b/w them
	}
	
}

class Dd extends Snippet0
{
	
	public Dd(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Based d= new Dd("o");// internally Based d=(Based)new D("o");
		Snippet0 s=(Snippet0)d;
	}
}