package javaprogrammingexercises;


/**
 * This program is a solution to Exercise 5.29 from the book "Java How to Program."
 * The program prints out the lyrics to the song "The Twelve Days of Christmas."
 */

public class TwelveDaysOfChristmas {

    public static void main(String[] args) {

       for (int day = 1; day <= 12; day++)
       {String d = "";
  
           switch (day)
           {
               case 1:
                        d = "first";
                   break;
                   
               case 2:
                       d = "second";
                   break;
                              
               case 3:
                         d = "third";
                   break;
                   
               case 4:
                         d = "fourth";
                   break;
                   
               case 5:
                         d = "fifth";
                   break;
                   
               case 6:
                         d = "third";
                   break;
                   
               case 7:
                         d = "seventh";
                   break;
                   
               case 8:
                         d = "eight";
                   break;
                   
               case 9:
                         d = "ninth";
                   break;
                   
               case 10:
                         d = "tenth";
                   break;
                   
               case 11:
                         d = "eleventh";
                   break;
                   
               case 12:
                         d = "twelvth";
            
           }
           
           System.out.printf("On the %s day of Christmas my true love sent to me\n",
                   d);
           
             for (int c = day; c > 0; c--)
             {
                switch (c)
                {
                    case 1:
                        System.out.println("a Partridge in a Pear tree.");
                        break;
                        
                   case 2:
                        System.out.print("Two Turtle Doves\nAnd ");
                        break;
                       
                   case 3:
                        System.out.println("Three French Hens,");
                        break;
                       
                   case 4:
                        System.out.println("Four Calling Birds,");
                        break;
                       
                   case 5:
                        System.out.println("Five Gold Rings,");
                        break;
                       
                   case 6:
                        System.out.println("Six Geese a-Laying,");
                        break;
                       
                   case 7:
                        System.out.println("Seven Swans a-Swimming,");
                        break;
                       
                   case 8:
                        System.out.println("Eight Maids a-Milking,");
                        break;
                       
                   case 9:
                        System.out.println("Nine Ladies Dancing,");
                        break;
                       
                   case 10:
                        System.out.println("Ten Lords a-Leaping,");
                        break;
                       
                   case 11:
                        System.out.println("Eleven Pipers Piping,");
                        break;
                       
                   case 12:
                        System.out.println("Twelve Drummers Drumming,");
                 
                }
             }
             
             System.out.println();
       }
    }
}