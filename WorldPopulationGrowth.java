package javaprogrammingexercises;

// This program calculates the world population and its increase over 75 years
// based on user input of the current world
// This is my solution to Exercise 4.39 from the book "Java How to Program." 

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variables for user input and population growth calculation
        float population, growthRate, populationGrowth;
        int year = 1;
        
        // Prompt user for input
        System.out.print("Enter current world population: ");
        population = input.nextFloat();
        
        System.out.print("Enter annual world population growth rate: ");
        growthRate = input.nextFloat();
        
        // Print table header
        System.out.println("year \t population \t\t population increase");
        
        // Calculate and print population growth for 75 years
        while (year <= 75) {
            populationGrowth = growthRate * population;
            population += populationGrowth;
            System.out.printf("%d \t %.2f \t\t %.2f\n", year, population, populationGrowth);
            year++;
        }
    }
}
