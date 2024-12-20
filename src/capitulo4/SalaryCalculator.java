package capitulo4;

import java.util.Scanner;

public class SalaryCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numberEmploy = input.nextInt();

        for (int i = 1; i <= numberEmploy; i++) {
            System.out.println("Employee " + i + ":");
            System.out.println("How many more hours did you work?");
            int moreHours = input.nextInt();
            int hoursWorked = 40;

        }






        input.close();
    }
}
