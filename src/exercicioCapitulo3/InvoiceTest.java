package exercicioCapitulo3;

import java.util.Scanner;

public class InvoiceTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Invoice invoice1 = new Invoice("1", "Chair", 2, 150.50);

        System.out.printf("---------- Invoice: %s ----------\nDescription: %s\nQuantity: %d\nItem Price: R$%.2f", invoice1.getNumber(), invoice1.getDescription(), invoice1.getPurchaseQuantity(), invoice1.getItemPrice());
        System.out.printf("\nInvoice Value: R$%.2f", invoice1.getInvoiceAmount());
    }
}
