/*
 * Exercise 10
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */

public class SpeedMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("14 Km -> miles = " + (14/1.6) + " miles");
		System.out.println("45 m and 30 s -> hour = " + (45.5/60 + " hour"));
		System.out.println();
		System.out.println("Average Speed = " + ((14/1.6)/(45.5/60)) + " mph");
	}

}