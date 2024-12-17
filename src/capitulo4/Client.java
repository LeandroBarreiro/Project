package capitulo4;

import java.util.Scanner;

public class Client {
    private int accountNumber;
    private int startMonthBalance;
    private int totalExpenses;
    private int totalCredits;
    private int creditLimit;

    Scanner input = new Scanner(System.in);

    public Client(int accountNumber, int startMonthBalance, int totalExpenses, int totalCredits, int creditLimit){
        this.accountNumber = accountNumber;
        this.startMonthBalance = startMonthBalance;
        this. totalExpenses = totalExpenses;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public int newBalence(){
        return startMonthBalance + totalExpenses - totalCredits;
    }

    public boolean exceededCredit(){
        return newBalence() > creditLimit;
    }

    public void askInfo(){
        System.out.println("Whats is your account number?");
        setAccountNumber(input.nextInt());

        System.out.println("Enter opening balance:");
        setStartMonthBalance(input.nextInt());

        System.out.println("Enter total expenses:");
        setTotalExpenses(input.nextInt());

        System.out.println("Enter total credit's:");
        setTotalCredits(input.nextInt());

        System.out.println("Enter the credit limit:");
        setCreditLimit(input.nextInt());
    }

    public void displayInfo(){
        int newBalence = newBalence();
        System.out.println("Account number: " + accountNumber);
        System.out.println("New Balence: " + newBalence);
        if (exceededCredit()) {
            System.out.println("Credit limit exceeded.");
        }
        else {
            System.out.println( "Within the credit limit");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getStartMonthBalance() {
        return startMonthBalance;
    }

    public void setStartMonthBalance(int startMonthBalance) {
        this.startMonthBalance = startMonthBalance;
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(int totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    

}