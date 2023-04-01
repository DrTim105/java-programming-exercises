package javaprogrammingexercises;

/**
 * BarChartPrintingProgram prompts the user to enter five numbers
 * between 1 and 30, then generates a bar chart using asterisks to
 * represent the entered values.
 * 
 * This program is a solution to Exercise 5.16 from the book "Java How to Program"

 */
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter five numbers between 1 and 30.
        System.out.println("Enter five numbers between 1 and 30: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        System.out.println("\nBARCHART OF NUMBERS:\n");

        // Check if the entered values are within the valid range.
        if (number1 > 0 & number2 > 0 & number3 > 0 && number4 > 0 && number5 > 0
            && number1 <= 30 && number2 <= 30 && number3 <= 30 && number4 <= 30 && number5 <= 30) {
            
            // Generate a bar chart using asterisks to represent the entered values.
            for (; number1 > 0; number1--) {
                System.out.print('*');
            }
            System.out.println();

            for (; number2 > 0; number2--) {
                System.out.print('*');
            }
            System.out.println();

            for (; number3 > 0; number3--) {
                System.out.print('*');
            }
            System.out.println();

            for (; number4 > 0; number4--) {
                System.out.print('*');
            }
            System.out.println();

            for (; number5 > 0; number5--) {
                System.out.print('*');
            }
            System.out.println();
        } else {
            // Display an error message if the entered values are outside the valid range.
            System.out.println("Invalid input! Please enter five numbers between 1 and 30.");
        }
    }
}