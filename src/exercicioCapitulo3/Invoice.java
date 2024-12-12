package exercicioCapitulo3;

public class Invoice { //Classe para reprensentar uma fatura de item em uma loja
    private String number; //Número da fatura
    private String description; // Descrição da fatura
    private int purchaseQuantity; //Quantidade de compra
    private double itemPrice; //Preço do item

    public Invoice(String number, String description, int purchaseQuantity, double itemPrice){ //Construtor
        this.number = number;
        this.description = description;
        this.purchaseQuantity = purchaseQuantity;
        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount(){
        int validPurchaseQuantity = (purchaseQuantity > 0) ? purchaseQuantity : 0;
        double validItemPrice = (itemPrice > 0) ? itemPrice : 0;
        return validPurchaseQuantity * validItemPrice;
    }

    //Métodos Getters e Setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    
}