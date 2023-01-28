package in.ineuron;

interface IComputer{
	abstract public void config();
}

public class InnerClass {
	public static void main(String[] args) {
		
		
		IComputer c= new IComputer() {
			public void config()
			{
				System.out.println("in config method");  // internally an anonymous inner class will be created that implements Computer interface
			}
		};
	}

}
