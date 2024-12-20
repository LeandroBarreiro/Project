package capitulo4;

import java.util.Scanner;


public class SalesCommission {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] valueItems = {239.99, 129.75, 99.95, 350.89};

        double baseSalary = 200.00;
        double commission = 0.09;

        System.out.println("Sales commission calculator:");
        System.out.println("Select the item old (1-4): (Enter 0 to exit)");

        double totalSale = 0.0;
        while (true) {
            System.out.println("Item sold:");
            int item = input.nextInt();

            if (item == 0) {
                System.out.println("Closing calculator");
                break;
            }
            else if(item >= 1 && item <= 4) {
                totalSale += valueItems[item -1];
            }
            else {
                System.out.println("Invalid item. Enter a number between 1 and 4 or 0 to exit.");
            }
        }

        double totalCommission = totalSale * commission;
        double totalSalary = baseSalary + totalCommission;

        System.out.printf("Total gross sales: R$%.2f.\n", totalSale);
        System.out.printf("Commission: R$%.2f.\n", totalCommission);
        System.out.printf("Total Salary: R$%.2f.\n", totalSalary);

        input.close();
    }
}
