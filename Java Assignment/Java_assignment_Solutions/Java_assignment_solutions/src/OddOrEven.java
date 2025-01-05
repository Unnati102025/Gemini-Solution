//8. Write a program that finds whether a given number is even or odd.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println("The number is even."); //if the number is divisible by 2 with no remainder
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close();
    }
}