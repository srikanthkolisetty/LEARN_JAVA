package in.ineuron;
import java.util.Arrays;
public class ArraysUtility {
	public static void main(String args[])
	{
		int p[]=new int[3];
		for(int r:p)
		{
			System.out.println(r);
		}
		Arrays.fill(p, 5);
		for(int r:p)
		{
			System.out.println(r);
		}
		Arrays.fill(p,0,2,10); // start from 0 (Inclusive) and end before 2 (exclusive)
		System.out.println(p);
		for(int r:p)
		{
			System.out.println(r);
		}
		Arrays.sort(p);
		System.out.println(Arrays.binarySearch(p, 10)); // return the index if 10 is found and negative index if element is not found like -(index+1) index is the value where that element would be present in the sorted array.
		System.out.println(Arrays.binarySearch(p,6)); // returns -2
	}

}
