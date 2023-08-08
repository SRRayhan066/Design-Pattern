package SolidPrinciple.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Macbook macbook = new Macbook();
        macbook.turnOnDevice();
        macbook.connectToAnotherDevice();
    }
}
