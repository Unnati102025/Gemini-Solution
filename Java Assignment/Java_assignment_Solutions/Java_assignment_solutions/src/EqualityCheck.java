//6. Write a program that checks whether the two numbers entered by the user are equal or not.

import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Checking equality
        if (num1 == num2) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }

        scanner.close();
    }
}
