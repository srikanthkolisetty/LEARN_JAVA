package in.ineuron;

class Hello
{	
	int a=10;
	String title;
	int value;
	Hello()
	{
		title+="world";
	}
	
	public Hello(int value)
	{
		this.value=value;
		title="Hello";
		Hello(); // this gives compile time error because compiler treats this as a method and seraches for it 
		// as Hello() method is not there it gives error but we think, to call constructor we should use this() that to in first line in the constructor body other wise gives error.
		
	}
}



public class Snippet01 {

	public static void main(String[] args) {
		
		boolean s=(true)?{System.out.println("k"); return true}:
			{
			System.out.println("l");
			return false;
			}
		
		// having multiple statements in terenary operator is not allowed in java.
	}
}
