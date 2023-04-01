package javaprogrammingexercises;

/**
 * This program calculates the total earnings for a salesperson based on the total value of items sold
 * and a fixed commission rate of 9%.
 * The program prompts the user to enter the value of each item sold, and then displays the total earnings
 * for the week after adding a fixed base amount of 200 naira to the commission.
 *
 * The program uses the JOptionPane class to display the prompts and message dialog box.
 *
 * This solution is for exercise 4.19 from the book "Java How to Program".
 */

import javax.swing.JOptionPane;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        double itemValue = 0, total = 0, earnings;
        int counter = 0;

        // Prompt user to enter item value
        String item = JOptionPane.showInputDialog("Enter item value or -1 to quit");
        itemValue = Double.parseDouble(item);

        // Calculate total value and count number of items
        while (itemValue != -1) {
            counter++;
            total += itemValue;

            // Prompt user to enter item value
            String item2 = JOptionPane.showInputDialog("Enter item value or -1 to quit");
            itemValue = Double.parseDouble(item2);
        }

        // Calculate earnings based on total value and fixed commission rate
        earnings = (double) 200 + (0.09 * total);

        // Display total earnings for the week
        String message = String.format("Total earnings for the week: ₦%.2f\n ", earnings);
        JOptionPane.showMessageDialog(null, message);
    }
}