package u3pp;

/**
 * Return leap years
 * Don't return not leap years (every 100 years is not a leap year)
 * 
 * @author Andrew Das
 *
 */

//public class LeapYear {
//	/**
//	 * every year before 1582 isn't a leap year
//	 */
//	public static boolean isLeapYear(int year) {
//		if (year < 1582)
//		{
//			return false;
//		}
//		if ((year % 4 == 0) && (year % 400 == 0))
//		{
//			if ((year % 100 == 0))
//			{
//				return false;
//			}
//			return true;
//		}
//		return false;
//		//if divisible by 4 and 100
//	}
//
//	public static void isLeapYear(String input) {
//		System.out.println("Hi");
//		
//	}
//}

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // every year before 1582 isn't a leap year
        if (year < 1582) {
            return false;
        }
        // divide every year by four then 100 to see if its divisible by both.
        if (year % 4 == 0) {
            // the leap year doesn't exist if its divisible by 100 but not 400
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}