package in.ineuron;


interface Pas
{
	
}
class Pe
{
	
}
// we can have empty interface and class
public class Label implements Pas{

	public static void main(String[] args) {
		
		System.out.println(new Label() instanceof Pas);
		System.out.println(new Label() instanceof Pe); // error because we are not having relation 
		System.out.println(new Pe() instanceof Pas); // no error even thoough there is no relation that is because when we are checking an object with a interface type we can check it and then returns tru or false based on relation.
		
		
	// lable for a group of statements	
		l:
		{
		System.out.println("k");
		}
	
	//labell for a loop 
	w:for(int i=0;i<3;i++)
	{
		System.out.println(i);
		if(i==2)
			break w;
	}
	
		//lable for a statement.
		p:System.out.println("l"); // the scope of p is upto this line only.
	
	
		
		
	}
}
