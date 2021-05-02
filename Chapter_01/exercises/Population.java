/*
 * Exercise 1.11
 * Write a program to display the population for each of the next five years. 
 * Assume the current population is 312,032,486 and one year has 365 days.
 * One birth every 7 seconds
 * One death every 13 seconds
 * One Immigrant every 45 seconds
 * 1 year = 365 day (24 hr/day)(3600 seg/hour) = 31,536,000
 */

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Population = " + 312032486);
		System.out.println("Birth Projection = " + (31536000/7.0));
		System.out.println("Death Projection = " + (31536000/13.0));
		System.out.println("Immigrant Projection = " + (31536000/45.0));
		System.out.println("New Pupulation = " + (312032486 + (31536000/7.0) 
				- (31536000/13.0) + (31536000/45.0) ) );
		
	}

}