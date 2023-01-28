package in.ineuron;

public class Local {

	int sq=82;
	void inc()
	{
		z(++sq);
		System.out.println(sq); // here we are printing instance variable one.
	}
	void z (int sq)
	{
		sq+=sq;
		System.out.println(sq); // here we are printing local variable sq not instance one
	}
	public static void main(String[] args) {
		new Local().inc();
	}
}
