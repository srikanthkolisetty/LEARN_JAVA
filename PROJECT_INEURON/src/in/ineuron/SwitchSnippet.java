package in.ineuron;

public class SwitchSnippet {
public static void main(String[] args) {
	int x=10;
	switch(x)
	{
	case 11: System.out.println("in");
	break;
	}
	
//	switch(x)
//	{
//			System.out.println("hi");
//	}
// in the second switch we get error because the print statement is not inside a case.
//anything in switch should be inside case statement.
	switch(x+1) 
	{ 
	case 11:System.out.println("11");
	break;
	case 10+20:
	case 10+20+30:
	}
	
	byte x=10; 
	switch(x+1) //byte + int ----> int , so switch(int)
	{ 
	case 10:System.out.println("hello");
	break;
	case 100: System.out.println("hiee");
	 break;
	case 1000: System.out.println("byee");
	 break;
	}
	switch(10)
	{
	
	}
	// empty switch is allowed.
	// the above type of switch is also allowed.
	// any operation on byte ,result of the opertion will be of int.
	
	
	
	
}
	

}
