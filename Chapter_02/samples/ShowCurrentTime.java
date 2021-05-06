public class ShowCurrentTime {
	public static void main(String[] args) {
		// obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// obtain total seconds since midnightm, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// compute current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// obtain the total of hours
		long totalHours = totalMinutes / 60;

		// compute the current hour
		long currentHour = totalHours % 24;

		// Display resutls
		System.out.println("Current time is " + currentHour + ":" + 
			currentMinute + ":" + currentSecond + " GMT");

	}
}