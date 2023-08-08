package SolidPrinciple.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        SellDevice inOnline = new SellOnline();
        SellDevice inOffline = new SellOffline();

        inOnline.sell();
        inOffline.sell();
    }
}
