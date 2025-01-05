//5. Write a program that swaps a programs value of two variables 
// using a third variable.  

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two variables
        System.out.println("Enter first variable: ");
        int a = scanner.nextInt();
        System.out.println("Enter second variable: ");
        int b = scanner.nextInt();

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        // Print swapped values
        System.out.println("After swapping: ");
        System.out.println("First variable: " + a);
        System.out.println("Second variable: " + b);

        scanner.close();
    }
}