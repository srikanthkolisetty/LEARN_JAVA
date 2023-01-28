package in.ineuron;

public class CodeSnippet2 {

	public static void main(String[] args) {
	
		String [] ar= {"one","two","three","four"};
		String s="faraway";
		System.out.println(ar[s.indexOf('a',3)]); // the second parameter for indexOf is to say about the start position to search for element
		String [] arr= {"one",null};
		System.out.println(ar[0].intern()==arr[0]); // it gives the output as true 
		
		
	}

}
