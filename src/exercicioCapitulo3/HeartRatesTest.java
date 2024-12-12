package exercicioCapitulo3;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        HeartRates heartRates1 = new HeartRates("", "", 0, 0, 0);

        Scanner input = new Scanner(System.in);

        System.out.printf("What is your first name?");
        heartRates1.setName(input.nextLine());

        System.out.printf("\nWhat is your last name?");
        heartRates1.setSurname(input.nextLine());

        System.out.printf("\nWhat day were you born?");
        heartRates1.setDay(input.nextInt());
        System.out.printf("\nWhat month were you born?");
        heartRates1.setMonth(input.nextInt());
        System.out.printf("\nWhat year were you born?");
        heartRates1.setYear(input.nextInt());

        System.out.println("You are " + heartRates1.ageInYear() + " years old");

        System.out.println("Your maximum frequency range: " + heartRates1.maximumHeartRate());
        System.out.println("Your target heart rate: " + heartRates1.targetHeartRate());

        input.close();
    }
}
