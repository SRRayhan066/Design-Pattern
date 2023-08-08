package SolidPrinciple.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.turnOnEngine();
        motorCycle.speedUp();
    }
}
