package javaprogrammingexercises;

/**
 * This program prompts the user to enter ten numbers and finds the two largest numbers among them.
 * The program uses a while loop to iterate through each number and compare it with the current largest numbers.
 * The program displays the two largest numbers at the end.
 *
 * This solution is for exercise 4.23 from the book "Java How to Program".
 */

import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0, number = 0, largest = 0, largest2 = 0;

        // Prompt user to enter ten numbers and find the two largest
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            counter++;

            if (number > largest) {
                largest2 = largest;
                largest = number;
            } else if (number > largest2) {
                largest2 = number;
            }
        }

        // Display the two largest numbers
        System.out.printf("The two largest numbers are %d and %d\n", largest, largest2);
    }
}
