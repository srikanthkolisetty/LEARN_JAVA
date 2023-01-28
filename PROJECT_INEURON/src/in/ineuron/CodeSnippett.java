package in.ineuron;

class Line
{
	public class Point
	{
		
	}
	public Point getPoint() {
		return new Point();
	}
}

public class CodeSnippett {

	public static void main(String[] args) {
		
	//	Point p= new Line().getPoint(); // this gives error at left side part because Point p is available inside Line class which can't be accessed without Line 
		
		Line.Point t= new Line().getPoint();
	}
	
}
