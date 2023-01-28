package in.ineuron;

interface P{
	void m2();
}
interface o{
	int m2();
}
public class MethodConflict implements p,o{

//	@Override
//	public int m2() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	public void m2()
	{
		System.out.println("k");
	}

	// error because compiler will shout at us saying once defined method can't be defined again.And the above one also not supports the method overloading concept.
}
