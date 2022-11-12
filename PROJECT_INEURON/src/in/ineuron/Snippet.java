package in.ineuron;

public class Snippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s=" "; //space is there 
			System.out.println(s.trim().equals(" ")); // trim removes space but not effects s , creates a new run time object in heap
			System.out.println(s.trim().equals("")); // true  
			System.out.println(s.equals("") +""+ s.isEmpty());
			//isEmpty returns true if the string is empty i mean even no space
			// s.equals("") returns false and trim method will not create any impact on string s 
			// because string is immutable.
			
			String s1="java";
			String s2="Java";
			if(s2.toLowerCase().intern() == s1)
			{
				System.out.println("yes");
			}
			// change on scp object also creates an object in heap level only . Blindly say that if it is runtime operation and causing a change on data it creates object in heap.
			
	}

}
