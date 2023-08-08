package SolidPrinciple.OpenClosedPrinciple;

public class SellOffline implements SellDevice{
    @Override
    public void sell() {
        System.out.println("Sell in offline");
    }
}
