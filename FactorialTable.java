package javaprogrammingexercises;

/**
 * This program calculates the factorial of numbers 0 to 20 and displays them in a table
 * It uses a for loop to iterate through each number and a while loop to calculate the factorial
 * The result is then displayed in a formatted table with the number and its corresponding factorial.
 * 
 * This program is a solution to Exercise 5.13 from the book "Java How to Program"
 */
public class FactorialTable {
    public static void main(String [] args) {
        // Print headers
        System.out.printf("%s\t%25s\n","NUMBER", "FACTORIAL");
        
        // Calculate and print factorial for each number 0-20
        for(int number = 0; number <= 20; number++ ) {
            System.out.printf("%6d\t", number);
            long factorial = 1;
            int n = number;
            
            // Calculate factorial using a while loop
            while (n > 0) {
                factorial *= n;
                n--;
            }
            System.out.printf("%,25d\n",factorial);           
        }
    }
}
