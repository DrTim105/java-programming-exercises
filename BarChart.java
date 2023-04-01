package javaprogrammingexercises;

/**
 * BarChart class represents a bar chart drawing in a GUI
 * 
 * This program is a solution to GUI Exercise 5.2 from the book "Java How to Program"

 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class BarChart extends JPanel {
    private int choice;
    private int choice1;
    private int choice2;
    private int choice3;
    private int choice4;
    
    public BarChart(int userChoice, int userChoice1, int userChoice2, int userChoice3, int userChoice4) {
        choice = userChoice;
        choice1 = userChoice1;
        choice2 = userChoice2;
        choice3 = userChoice3;
        choice4 = userChoice4;
    }
    
    public void setUserChoice(int userChoice) {
        choice = userChoice;
    }
    
    public int getUserChoice() {
        return choice;
    }
    
    public void setUserChoice1(int userChoice1) {
        choice1 = userChoice1;
    }
    
    public int getUserChoice1() {
        return choice1;
    }
       
    public void setUserChoice2(int userChoice2) {
        choice2 = userChoice2;
    }
    
    public int getUserChoice2() {
        return choice2;
    }
        
    public void setUserChoice3(int userChoice3) {
        choice3 = userChoice3;
    }
    
    public int getUserChoice3() {
        return choice3;
    }        
            
    public void setUserChoice4(int userChoice4) {
        choice4 = userChoice4;
    }
    
    public int getUserChoice4() {
        return choice4;
    }    
            
    // Method to draw bar chart based on user choices
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            
        g.drawRect(0, 0, 20 + getUserChoice() * 10, 20);    
        g.drawRect(0, 40, 20 + getUserChoice1() * 10, 20);
        g.drawRect(0, 80, 20 + getUserChoice2() * 10, 20);
        g.drawRect(0, 120, 20 + getUserChoice3() * 10, 20); 
        g.drawRect(0, 160, 20 + getUserChoice4() * 10, 20); 
    }    
}


