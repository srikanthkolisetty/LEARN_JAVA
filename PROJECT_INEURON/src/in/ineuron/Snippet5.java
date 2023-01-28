package in.ineuron;

interface Fooo
{
	void abc();
}
class Beta implements Fooo
{	
	public void abc()
	{
		
	}
	
}
public class Snippet5 extends Beta {
	Beta q;
	void ab()
	{	
		Snippet5 w=(Snippet5) q; // no error because q has no object it is just reference with null value.
		System.out.println("as");
	}
 public static void main(String[] args) {
	Beta x=new Beta();
	((Snippet5)x).ab();// as this is explicit casting compiler will not get to know about the mistake 
	// we will get the class cast exception as parent object can't be referenced by the child reference.
	Fooo s=x;
	Fooo r= new Beta();
	Snippet5 y= new Snippet5();
	Snippet5 i= new Beta(); // not possible
	Fooo k=y;
	Beta t= new Snippet5(); 
	((Snippet5)t).ab(); // this is possible because the t reference holds object of type snippet5 and this can sit in snippet5 reference type.
	 
	Fooo n= new Snippet5(); // specialized methods can't be called
}
 /*
  * child to parent implicit
  */

}
