package javaprogrammingexercises;

/**
 * This program is a modified version of the Triangle Printing Program, which 
 * prints a unique pattern of asterisks and spaces.
 * It prints a 4-part figure consisting of 10 lines of asterisks and spaces. 
 * 
 * This program is a solution to Exercise 5.22 from the book "Java How to Program"

 */
public class TrianglePrintingProgramModified
{
    public static void main(String [] args)
    {
        for (int number = 1; number <= 10; number++)
        {
           for (int n = number; n > 0; n--)
           {
               System.out.print('*');
           } 
           
           for (int n = number; n <= 10; n++)
           {
               System.out.print(' ');
           } 
           
           for (int n = number; n <= 10; n++)
            {
                System.out.print('*');
            } 
            
           for (int n = number; n > 0; n--)
           {
               System.out.print(' ');
           } 
           
           for (int n = number; n > 0; n--)
            {
                System.out.print(' ');
            } 
            
            for (int n = number; n <= 10; n++)
            {
                System.out.print('*');
            } 
            
            for (int n = number; n <= 10; n++)
            {
                System.out.print(' ');
            } 
            
            for (int n = number; n > 0; n--)
           {
               System.out.print('*');
           } 
            
           System.out.println();
        }
    }
}