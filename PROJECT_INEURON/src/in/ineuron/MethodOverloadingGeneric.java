package in.ineuron;
import java.util.ArrayList;
public class MethodOverloadingGeneric {

	public void add(ArrayList<Integer> a)
	{
		
	}
	public void add(ArrayList<String>b)
	{
		
	}

	// if we observe above methods actually they are method overloading but they are not.
	/*
	 * 
	 * At last as the generic syntax will be removed then both becomes same as generic syntax removed 
	 * which is not correct. From this we  can conclude that method overloading based on generic 
	 * is not possible.
	 */
	public static void main(String[] args) {
		
	}
}
