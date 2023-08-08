package SolidPrinciple.SingleResponsibilityPrinciple;

public class PrintInvoice {
    private Invoice invoice;
    public PrintInvoice(Invoice invoice){
        this.invoice=invoice;
    }
    public void print(){
        System.out.println("Total Cost "+invoice.calculateTotal());
    }
}
