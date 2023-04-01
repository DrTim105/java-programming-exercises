package javaprogrammingexercises;

/**
 * This program prints different variations of triangles using asterisks and spaces.
 * 
 * This program is a solution to Exercise 5.15 from the book "Java How to Program"

 */
public class TrianglePrintingProgram {
    public static void main(String [] args) {
        // prints a right-angled triangle pointing upwards
        for (int number = 1; number <= 10; number++) {
            for (int n = number; n > 0; n--) {
                System.out.print('*');
            } 
            System.out.println();
        }
        
        // prints a right-angled triangle pointing downwards
        for (int number = 10; number > 0; number--) {
            for (int n = number; n > 0; n--) {
                System.out.print('*');
            } 
           System.out.println();
        }
        
        // prints an inverted right-angled triangle pointing downwards
        for (int number = 10; number > 0; number--) {
            for (int n = number; n <= 10; n++) {
                System.out.print(' ');
            } 
            
            for (int n = number; n > 0; n--) {
                System.out.print('*');
            } 
            System.out.println();
        }
        
        // prints an inverted right-angled triangle pointing upwards
        for (int number = 1; number <= 10; number++) {
            for (int n = number; n <= 10; n++) {
                System.out.print(' ');
            } 
            
            for (int n = number; n > 0; n--) {
                System.out.print('*');
            } 
            System.out.println();
        }   
    }
}