package in.ineuron;

public class CodeSnippet3 {
	 int a=10;	
	public  String toString()
	{
		return null;
	} // here the return value will be like "null" it can be converted
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String text=null;
//			text=text+new CodeSnippet3(); //null +"null" if one is string then + automatically performs concatenation only
			System.out.println(text);
			CodeSnippet3 s= new CodeSnippet3();
			System.out.println(s+""+s.a);
	}

}
