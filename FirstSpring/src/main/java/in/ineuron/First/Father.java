package in.ineuron.First;

public class Father {

	private  IPerson Mother;
	

	public IPerson getMother() {
		return Mother;
	}

	public void setMother(IPerson mother) {
		Mother = mother;
	}

	//private IPerson person2;
	public Father()
	{
		System.out.println("inside the father constructor");
	}
	
	public void iamMethod()
	{
		System.out.println(Mother.getClass().getName());
		//System.out.println(person2.getClass().getName());
	}
	
}
