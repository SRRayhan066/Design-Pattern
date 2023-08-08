package SolidPrinciple.SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Macbook macbook = new Macbook("Macbook Pro",150000);
        Invoice invoice = new Invoice(macbook,10);
        PrintInvoice printInvoice = new PrintInvoice(invoice);
        printInvoice.print();
    }
}
