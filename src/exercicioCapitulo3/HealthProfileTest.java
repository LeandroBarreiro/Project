package exercicioCapitulo3;

import java.util.Scanner;

public class HealthProfileTest {
    
    public static void main(String[] args) {
        
        HealthProfile healthProfile1 = new HealthProfile(null, null, null, 0, 0, 0, 0.0, 0);

        Scanner input = new Scanner(System.in);

        System.out.println("Whats your name?");
        healthProfile1.setName(input.nextLine());

        System.out.println("Whats your surname?");
        healthProfile1.setSurname(input.nextLine());

        System.out.println("Day you were born?");
        healthProfile1.setDay(input.nextInt());

        System.out.println("Mounth you were born?");
        healthProfile1.setMounth(input.nextInt());
        
        System.out.println("Year you were born?");
        healthProfile1.setYear(input.nextInt());

        System.out.println("How tall are you in meters?");
        healthProfile1.setMeters(input.nextDouble());

        System.out.println("What is your weight in kilos?");
        healthProfile1.setWeight(input.nextInt());

        System.out.println("You are " + healthProfile1.ageInYear() + " year old");

        healthProfile1.imc();

        System.out.println("Your maximum heart rate range: " + healthProfile1.maximumHeartRate());
        System.out.println("Your target heart rate is: " + healthProfile1.calculateTargetHeartRate());
    }
}
