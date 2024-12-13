package exercicioCapitulo3;

import java.util.Scanner;

public class HeartRatesTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        HeartRates heartRates1 = new HeartRates(null, null, 0, 0, 0);

        System.out.println("First name: ");
        heartRates1.setName(input.nextLine());

        System.out.println("Last name: ");
        heartRates1.setSurname(input.nextLine());

        System.out.println("Day you were born: ");
        heartRates1.setDay(input.nextInt());

        System.out.println("Month you were born?");
        heartRates1.setMonth(input.nextInt());

        System.out.println("Year you were born?");
        heartRates1.setYear(input.nextInt());

        int age = heartRates1.ageInYear();
        System.out.println("You are " + age + " year old");

        System.out.println("Your maximum heart rate range: " + heartRates1.maximumHeartRate());
        System.out.println("Your target heart rate is: " + heartRates1.calculateTargetHeartRate());




        input.close();
    }
}
