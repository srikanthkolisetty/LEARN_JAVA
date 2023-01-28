package in.ineuron;
class Encap
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}






public class Instance {
	
	int age;
	
	public static void main(String[] args) {
		
		
//		System.out.println(age); // error because in static method instance variables can't be accessed , if need to access we need to access it by using the object. 
		
	}

}
