package javaprogrammingexercises;

/**
 * This program calculates compound interest and outputs the result for ten years
 * with the interest compounded annually. The interest rate and principal are predefined.
 * 
 * This program is a solution to Exercise 5.18 from the book "Java How to Program"
 */

public class ModifiedCompoundInterest {
    
        public static void main(String[] args) {
        // Declare and initialize necessary variables
        int amount;
        int naira;
        int kobo;
        int principal = 1000;
        double rate = 0.05;

        // Output table header
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        // Calculate and output amount for each year using a for loop
        for (int year = 1; year <= 10; year++) {
            amount =  (int) (principal * Math.pow(1.0 + rate, year) * 100);
            kobo = amount % 100;
            kobo /= 10;
            naira = amount / 100;
            System.out.printf("%4d%,20d.%d\n", year, naira, kobo);
        }
    }
}
