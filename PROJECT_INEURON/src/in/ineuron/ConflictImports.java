package in.ineuron;

import java.util.Scanner;
import java.util.*;
// here explicit import is choosen first by the compiler
//
//import static  java.lang.Math; this line gives error because when we have used 
 
/* 
 * the static keyword then we should specify the method which is static in import statement or .*
 * '*' in import will not search class files under sub packages.
 *
 */
import static java.lang.Math.sqrt;

// now in our code we can directly call sqrt() with out using class name.sqrt() is static method in Math class
public class ConflictImports {
	public static void main(String[] args) {
		
		java.util.Scanner s= new java.util.Scanner(System.in); // we can specify this way also
		/*
		 * 
		 * 
		 * But the problem with the above 11 th line is suppose if we want to call a method using class 
		 * name then that time we need to specify full path every time which can be avoided if we make use of 
		 * imports.
		 * ex : String.join() is being called with out specifying full path like java.lang.String.join() it is just example as in real
		 * time we no need to write import or fully qualified path for lang packages. But this can be applied for others.
		 */
		int h=s.nextInt();
		
		System.out.println(sqrt(9)); // no need to write Math.sqrt()
		
	}
}
