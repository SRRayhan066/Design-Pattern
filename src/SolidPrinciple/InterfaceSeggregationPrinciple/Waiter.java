package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("Serves a customer.");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order.");
    }
}
