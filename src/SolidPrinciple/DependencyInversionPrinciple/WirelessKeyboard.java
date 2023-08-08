package SolidPrinciple.DependencyInversionPrinciple;

public class WirelessKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Here used wireless keyboard.");
    }
}
