package in.ineuron;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		 try
	        {
	        Scanner s= new Scanner(System.in);
	        int x=Integer.parseInt(s.nextLine());
	        System.out.println(x);
	        int y=Integer.parseInt(s.nextLine());
	        System.out.println(y);
	        if(x<= 2147483647 && x >= -2147483648 && y<= 2147483647 && y >= -2147483648)    System.out.println(x/y);
	        else throw new InputMismatchException();
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println("java.lang.ArithmeticException: / by zero");
	     
	        }
	        catch(InputMismatchException e)
	        {
	            System.out.println("java.util.InputMismatchException");
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	}
}
