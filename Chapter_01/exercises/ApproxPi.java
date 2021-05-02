/*
 * Exercise 1.7
 * Aproximate the value of Pi using the formula on page 31
 * Use 1.0 instead of 1
 */

public class ApproxPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \u03C0 unicode for pi symbol
		System.out.println("\u03C0 approx#1 = " + (4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9
				- 1.0/11)));
		System.out.println("\u03C0 approx#2 = " + (4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9
				- 1.0/11 + 1.0/13)));
	}

}