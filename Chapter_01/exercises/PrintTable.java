/*
 * Exercise 1.4
 * (Print a table) Write a program that displays the following table:
 * 		a		a^2		a^3
 * 		1		 1		 1
 * 		2		 4		 8
 * 		3		 9		 27
 * 		4		 16		 64
 */

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\ta^2\ta^3");
		System.out.println("1\t 1\t 1");
		System.out.println("2\t " + (2*2) + "\t " + (2*2*2));
		System.out.println("3\t " + (3*3) + "\t " + (3*3*3));
		System.out.println("4\t " + (4*4) + "\t " + (4*4*4));
	}

}