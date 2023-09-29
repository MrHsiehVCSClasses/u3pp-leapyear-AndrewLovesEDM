package u3pp;

/**
 * Return leap years
 * Don't return not leap years (every 100 years is not a leap year)
 * 
 * @author Andrew Das
 *
 */

public class LeapYear {
	/**
	 * every year before 1582 isn't a leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year < 1582)
		{
			return false;
		}
		if ((year % 4 == 0) && (year % 400 == 0))
		{
			if ((year % 100 == 0))
			{
				return false;
			}
			return true;
		}
		return false;
		//if divisible by 4 and 100
	}

	public static void isLeapYear(String input) {
		System.out.println("Hi");
		
	}
}