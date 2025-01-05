// 1. Write a program that accepts the marks of 5 subjects and finds the sum and percentage marks obtained by the student.
import java.util.Scanner;

public class SumAndPercent {
    public static void main(String[] args) {
        // Initialize Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            sum += scanner.nextInt(); //Calculating Sum
        }

        // Calculating percentage
        double percentage = (sum / 500.0) * 100;

        // Printing results
        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close(); // To avoid resource leaks
    }
}