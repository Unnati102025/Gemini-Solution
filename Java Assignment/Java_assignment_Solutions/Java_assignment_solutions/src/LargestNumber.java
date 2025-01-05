//7. Write a program to find the greatest of three numbers.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find the greatest number
        int greatest = Math.max(num1, Math.max(num2, num3));

        // Print result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
