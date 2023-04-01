package javaprogrammingexercises;
/**
 * This program draws a square of asterisks with sides of user-specified length.
 * It prompts the user to input a size, then displays a square of asterisks
 * of that size. The square has asterisks on the perimeter and spaces inside.
 * 
 * This solution is for exercise 4.29 from the book "Java How to Program".
 */

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int size = 0, counter = 0, counter2 = 0;
        System.out.print("Enter size: ");
        size = input.nextInt();

        // draw the top row of asterisks
        for (; counter < size; ++counter) {
            System.out.print("* ");
        }
        System.out.print("\n");
        
        // draw the middle rows of asterisks
        counter = 0;
        for (; counter < (size-2); counter++, counter2 = 0) {
            System.out.print("*");
            while (counter2 < (size-2)) {
                System.out.print("  ");
                counter2++;
            }
            System.out.println(" *");
        }

        // draw the bottom row of asterisks
        counter = 0;
        for (; counter < size; ++counter) {
            System.out.print("* ");
        }
        System.out.println();
    }
}