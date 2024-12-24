package capitulo4;

import java.util.Scanner;

public class CryptoTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4-digit number:");
        int number = input.nextInt();

        if(number < 1000 || number > 9999 ) {
            System.out.println("Please enter a 4-digit a number:");
            return;
        }

        int numberCrypto = EnforcingEncryption.crypto(number);
        System.out.println("Encrypted number: " + numberCrypto);


        int numberDecrypt = Decrypt.decrypt(number);
        System.out.println("Decrypted number: " + numberDecrypt);




        input.close();
    }
}
