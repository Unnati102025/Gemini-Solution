//10. Write a program that accepts marks of five subjects and finds percentage and prints grades according to the following criteria:
//Between 90-100%	------ Print ‘A’
//Between 80-90%	------ Print ‘B’
//Between 60-80%	------ Print ‘C’
//Below   60%		------ Print ‘D’

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        int total_marks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            total_marks += scanner.nextInt(); //Calculating Total Marks
        }

        // Calculate percentage
        double percentage = (total_marks / 500.0) * 100;

        // Determining grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Printing results
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
