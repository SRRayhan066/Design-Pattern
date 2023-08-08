package SolidPrinciple.LiskovSubstitutionPrinciple;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }
    public void speedUp(){
        speed+=10;
    }
}
