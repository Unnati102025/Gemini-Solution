//9. Write a program that tells whether a given year is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check leap year
        // A year is a leap year if:
        // It is divisible by 4, but not divisible by 100 unless it is also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year."); //If conditions fail, not a leap year
        }

        scanner.close();
    }
}