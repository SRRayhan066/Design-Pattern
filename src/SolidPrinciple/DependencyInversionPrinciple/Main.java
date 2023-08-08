package SolidPrinciple.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        MacBook macBook = new MacBook(new WirelessKeyboard(),new WirelessMouse());
        macBook.run();

        MacBook mackBook2 = new MacBook(new WirelessKeyboard(),new WiredMouse());
        mackBook2.run();
    }
}
