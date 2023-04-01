package javaprogrammingexercises;

/**
 * BarChartTest class tests the BarChart class by getting user input for 5 numbers 
 * and displaying them as a bar chart in a GUI
 * 
 * This program is a solution to GUI Exercise 5.2 from the book "Java How to Program"
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BarChartTest {
    public static void main(String[] args) {
        BarChart panel = new BarChart(1, 2, 3, 4, 5);
        
        String number = JOptionPane.showInputDialog("Enter first number:");
        int choice = Integer.parseInt(number);
        panel.setUserChoice(choice);
        
        String number1 = JOptionPane.showInputDialog("Enter second number:");
        int choice1 = Integer.parseInt(number1);
        panel.setUserChoice1(choice1);
        
        String number2 = JOptionPane.showInputDialog("Enter third number:");
        int choice2 = Integer.parseInt(number2);
        panel.setUserChoice2(choice2);
        
        String number3 = JOptionPane.showInputDialog("Enter fourth number:");
        int choice3 = Integer.parseInt(number3);
        panel.setUserChoice3(choice3);
        
        String number4 = JOptionPane.showInputDialog("Enter fifth number:");
        int choice4 = Integer.parseInt(number4);
        panel.setUserChoice4(choice4);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}