
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.

public class Account {

    private String name; // variável de instância
    private double balance; // variável de instância

    // o construtor inicializa name com nome do parâmetro
    public Account(String name, double balance){ // o nome do construtor é nome da classe
        this.name = name;

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo 
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) { // se depositAmount for válido
            balance += depositAmount; // o adiciona ao saldo
        }
    }

    //Método que efetua um saque no saldo.
    public double withdraw(double withdraw){
        if(withdraw > balance){ //Se o saque solicitado for maior que o saldo.
            System.out.println("Withdrawal amount exceeded account balance."); // Exibe uma mensagem.
        }
        else{
            balance =  balance - withdraw; //Caso não diminui o valor do saldo pelo valor solicitado.
        }
        return  balance;
    }

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: R$%.2f \n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }

    public double getBalance(){
        return balance;
    }

    // método para definir o nome no objeto 
    public void setNome(String name){
        this.name = name; // armazena o nome 
    }

    // método para recuperar o nome do objeto 
    public String getName(){
        return name; // retorna valor do nome para o chamador
    }
} // fim da classe Account
