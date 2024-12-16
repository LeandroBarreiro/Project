package capitulo4;

import java.util.Scanner;

public class FuelMileage{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int liters;
        int kilometers;
        int totalKilometers = 0;
        int totalLiters = 0;

        System.out.println("Enter -1 to end data entry.");

        while (true) { 
            
            System.out.println("Enter the kilometers driven: ");
            kilometers = input.nextInt();

            if(kilometers == -1){
                break;
            }

            System.out.println("Enter the liters consumed: ");
            liters = input.nextInt();
            
            if(liters == -1){
                break;
            }

            if(liters <= 0){
                System.out.println("Error: The number of liters must be greater than zero.");
                continue;
            }

            double travelConsumption = (double) kilometers / liters;
            System.out.printf("Consumption of this trip: %2.f km/L\n", travelConsumption);

            totalKilometers += kilometers;
            totalLiters += liters;

            System.out.printf("Total number of kilometers: %d Km", kilometers);
            System.out.printf("Total liters: %dL", liters);
        
        }

        if(totalLiters > 0){
            double averageConsumption = (double) totalKilometers / totalLiters;
            System.out.println("The average consumption of this trip is: " + averageConsumption);
        }


    }
}