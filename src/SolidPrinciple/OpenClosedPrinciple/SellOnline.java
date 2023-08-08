package SolidPrinciple.OpenClosedPrinciple;

public class SellOnline implements SellDevice{
    @Override
    public void sell() {
        System.out.println("Sell in online");
    }
}
