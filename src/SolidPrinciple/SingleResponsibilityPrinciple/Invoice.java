package SolidPrinciple.SingleResponsibilityPrinciple;

public class Invoice {
    private Macbook macbook;
    private int quantity;

    public Invoice(Macbook mackbook,int quantity){
        this.macbook=mackbook;
        this.quantity=quantity;
    }

    public int calculateTotal(){
        int price=(macbook.price*this.quantity);
        return price;
    }
}
