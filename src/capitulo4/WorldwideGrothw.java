package capitulo4;

import java.util.Scanner;

public class WorldwideGrothw {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int years = 1;

        System.out.println("------------------- World demographic growth in 75 years ------------------");
        System.out.println("Enter the current world population (in billions).");
        double populationCurrent = input.nextDouble();

        System.out.println("Year\t\tWorld Population (B)\t\tIncrease in population (B)");

        double population= populationCurrent;
        double populationIncrease;
        int yearDoubled = -1;


        do { 
            populationIncrease = population * 0.0091;
            population += populationIncrease;

            System.out.printf("%d\t\t%.2f Billions \t\t\t%.2f%n", years, population, populationIncrease);

            if (yearDoubled == -1 && population >= populationCurrent * 2) {
                yearDoubled = years;
            }
            years++;
        } while (years <= 75);

        if (yearDoubled != -1) {
            System.out.println("The population will double in the year: " + yearDoubled);
        } else {
            System.out.println("The population will not double in the next 75 years.");
        }
    }
}
