/*
 * Exercise 1.12
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 */

public class SpeedKM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("24 miles -> Km = " + (24*1.6) + " Km");
		// .5833 is from 35s/60s
		System.out.println("40 m , 35 s -> hour + 1 = " + ((40.5833/60 + 1) + " hour"));
		System.out.println();
		System.out.println("Speed = " + ((24*1.6)/(40.5833/60 + 1)) + " Km/hr");
	}

}