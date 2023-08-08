package SolidPrinciple.SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Faber-castle",50);
        Invoice invoice = new Invoice(marker,10);
        PrintInvoice printInvoice = new PrintInvoice(invoice);
        printInvoice.print();
    }
}
