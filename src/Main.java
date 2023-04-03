/**
 * Determines the amount of minutes in a year based on standards.
 */
public class Main {

	/** Compiler constructor. */
	public static void main(String[] args) {
		// The amount of days in a year.
		int daysPerYear = 365;
		// The amount of hours in a day.
		int hoursPerDay = 24;
		// The amount of minutes in an hour.
		int minutesPerHour = 60;
		// Using the conversion factors and principles of cancellation to determine how
		// many minutes are in a year.
		int minutesPerYear = daysPerYear * hoursPerDay * minutesPerHour;

		// Prints a statement containing the result of the conversion.
		System.out.println("There are " + minutesPerYear + " minutes in one calendar year.");
	}
}