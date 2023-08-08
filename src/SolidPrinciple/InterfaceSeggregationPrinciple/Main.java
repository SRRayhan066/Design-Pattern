package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        waiter.takeOrder();
        chef.cookFood();
        waiter.serveCustomer();
    }
}
