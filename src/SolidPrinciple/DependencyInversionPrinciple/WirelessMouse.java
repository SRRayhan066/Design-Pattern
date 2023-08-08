package SolidPrinciple.DependencyInversionPrinciple;

public class WirelessMouse implements Mouse{
    @Override
    public void point() {
        System.out.println("Using wireless mouse.");
    }
}
