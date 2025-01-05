//2. Write a program that calculates the Simple Interest and Compound Interest.
// The Principal, Amount, Rate of Interest and Time are entered through the keyboard.

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.println("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculating Compound Interest
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        // Printing results
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        System.out.printf("Compound Interest: %.2f%n", compoundInterest);

        scanner.close(); // To avoid resource leaks
    }
}