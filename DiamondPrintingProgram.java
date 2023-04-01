package javaprogrammingexercises;

/**
 * This program is a solution to Exercise 5.24 & 5.25 from the book "Java How to Program"
 * The program prints a diamond shape based on an odd integer input by the user 
 * within the range of 1 to 19. 
 * The diamond is made of asterisks (*) and spaces.
 */

import java.util.Scanner;

public class DiamondPrintingProgram {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter odd number in the range of 1 to 19"
                + " to specify the number of rows of diamond");
        int number = input.nextInt();
        int diamond = 1;
        
        System.out.println();
        
        if (number % 2 == 1 && number >= 1 && number <= 19) {
            
            for (int no = number / 2; no > 0; no--) {

                for (int n = no; n > 0; n--) {
                    System.out.print(' ');
                }

                for (int d = diamond; d > 0; d--) {
                    System.out.print('*');
                }

                diamond += 2;
                System.out.println();
            }

            for (int no = number / 2; no >= 0; no--) {

                for (int n = no; n < (number / 2); n++) {
                    System.out.print(' ');
                }

                for (int d = diamond; d > 0; d--) {
                    System.out.print('*');
                }

                diamond -= 2;
                System.out.println();
            } 
        }
        else {
            System.out.println("Shebi you said you can't hear word");
        }
    }
}
