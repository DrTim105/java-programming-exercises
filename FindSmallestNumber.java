package javaprogrammingexercises;

/**
 * The SmallestNumber program reads a specified number of integers from the user and 
 * returns the smallest integer entered. 
 * 
 * This program is a solution to Exercise 5.11 from the book "Java How to Program"

 */

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int number = 0, integer = 0, smallest = 0;

        System.out.print("input number of integers: ");
        number = input.nextInt();

        if (number != 0)
            smallest = number;
        else
            System.out.println("input a number please");

        while (number > 0)
        {
            System.out.print("input integer: ");
            integer = input.nextInt();

            if (integer < smallest)
                smallest = integer;
            number--;
        }

        System.out.printf("Smallest integer is: %d\n", smallest);
    }
}
