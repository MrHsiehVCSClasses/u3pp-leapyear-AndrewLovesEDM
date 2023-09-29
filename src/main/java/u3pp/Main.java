package u3pp;

import java.util.Scanner;

/**
 * create scanner and make scanner equal the input
 * 
 * 
 * @author Andrew Das
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();

		while (!input.toUpperCase().equals("STOP")) {
			System.out.print("Enter a year (or enter STOP to end): ");
			input = sc.nextLine();
			int baller = Integer.parseInt(input);
			//int LeapYear;
			LeapYear.isLeapYear(input);
			
			
		}
		sc.close();
	}
}