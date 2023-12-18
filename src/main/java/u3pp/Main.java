package u3pp;

import java.util.Scanner;

/**
 * create scanner and make scanner equal the input
 * 
 * 
 * @author Andrew Das
 */

//class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a year (or enter STOP to end): ");
//		String input = sc.nextLine();
//
//		while (!input.toUpperCase().equals("STOP")) {
//			System.out.print("Enter a year (or enter STOP to end): ");
//			input = sc.nextLine();
//			int baller = Integer.parseInt(input);
//			int LeapYear;
//			LeapYear.isLeapYear(input);
//			
//			
//		}
//		sc.close();
//	}
//}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Take input from the user
            System.out.print("Enter a year (or type STOP to end): ");
            String input = sc.nextLine();
            //use trim to cut out any extra spaces
            input.trim();

            // Check if the user wants to stop
            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            // Converts an input to an integer
            // use "try" to catch exceptions and errors. 
            try {
                int year = Integer.parseInt(input);

                // Use LeapYear class to check if year is a leap year.
                boolean isItALeapYear = LeapYear.isLeapYear(year);

                // show the result
                if (isItALeapYear) {
                	System.out.println(year + " is a leap year.");
                }
                else {
                	System.out.println(year + " is not a leap year.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year or type STOP to end.");
            }
        }

        // Close the scanner at the end
        sc.close();
    }
}