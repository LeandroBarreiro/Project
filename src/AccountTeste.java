// Cria e manipula um objeto Account.
import java.util.Scanner;

public class AccountTeste {
    
    public static void main(String[] args) {
        
         // cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria dois objetos Account 
        Account account1 = new Account("Leandro Barreiro", 50.00);
        Account account2 = new Account("Érica Barreiro", -7.53);


        // exibe saldo inicial de cada objeto
        Account.displayAccount(account1);
        Account.displayAccount(account2);


        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);  // adiciona o saldo de account1

        // exibe os saldos
        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();

        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.println("What amount do you want to withdraw from account1?");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);

        System.out.println("What amount do you want to withdraw from account2?");
        withdrawAmount = input.nextDouble();
        account2.withdraw(withdrawAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);



    }
} // fim da classe AccountTest
