package javaprogrammingexercises;

/**
 * This program prompts the user to enter ten numbers and finds the largest number among them.
 * The program uses a while loop to iterate through each number and compare it with the current largest number.
 * The program displays the largest number at the end.
 *
 * This solution is for exercise 4.21 from the book "Java How to Program".
 */

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0, number = 0, largest = 0;

        // Prompt user to enter ten numbers and find the largest
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            counter++;

            if (number > largest)
                largest = number;
        }

        // Display the largest number
        System.out.printf("The largest number is %d\n", largest);
    }
}
