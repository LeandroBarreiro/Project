package capitulo4;

import java.util.Scanner;

public class ClientTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Client client = new Client(0, 0, 0, 0, 0);
        
       client.askInfo();

        client.displayInfo();

    }
}
