//4. Write a program that accepts the temperature in Centigrade and converts into Fahrenheit
// using the formula C/5= (F- 32)/9.

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Centigrade
        System.out.println("Enter temperature in Centigrade: ");
        double centigrade = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (centigrade * 9 / 5) + 32;

        // Printing result
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();
    }
}