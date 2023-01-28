package in.ineuron;

import java.util.Scanner; // explicit import
import java.util.*; //implicit import
/*
 * Imports are dynamic inclusion
 * .class files are loaded by jvm when they are needed only.
 * 
 */

public class Import {
 public static void main(String[] args) {
	String s="lang";
	/*
	 * 
	 * we know String is available in the package java.lang 
	 * but if we observe we have not imported it? The reason is for any .class files 
	 * those are present in the lang package or in the current working
	 * directory we no need to write the import statements.
	 */
}
}
