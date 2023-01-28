package in.ineuron;

public class Snippet3 {
public static void m(int i)
{
	System.out.println(i);
	i++;
	
}
public static void main(String[] args) {
	
int a=3;
Snippet3.m(a++); // here a value gets updated.
System.out.println(a); // 4
}
}
