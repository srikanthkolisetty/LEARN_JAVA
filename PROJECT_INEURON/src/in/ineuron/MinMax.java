package in.ineuron;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 1, 4, 29, 3, 10 };
		// a={1,3}; //this gives error
		int b[] = new int[5];
		// b= {1,2,3,4,5}; gives error
		// int c[]=new int[4]{1,2,3,4}; error when we do like this size should not be
		// mentioned
		b[0] = 1;
		int c[]= {1,2,3,4};
		int max = 0, min = a[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			if (min > a[i])
				min = a[i];
		}
		System.out.println(min + " " + max);
	}

}
