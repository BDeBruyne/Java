/**
 * Title: Circle Parameters
 * @author DeBruyne
 * Created date: 2022-03-06
 * Modified date: 2022-03-06
 * Modified by: DeBruyne
 *Description of program: 
  *This program prompts the user for birthday month, day, 
 *and year and prints the date of the user’s one-hundredth 
 *birthday. 
 *
 */


import java.util.Scanner;

public class oneHundredthBirthday {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String month;
		int day;
		int year;
		int answer;
		System.out.println("Enter the month you were born: ");
		month = stdIn.next();
		System.out.println("Enter the day you were born: ");
		day = stdIn.nextInt();
		System.out.println("Enter the year you were born: ");
		year = stdIn.nextInt();
		
		answer = (year + 100);
		System.out.println("You will be 100 on : " + answer);
		
	}
}