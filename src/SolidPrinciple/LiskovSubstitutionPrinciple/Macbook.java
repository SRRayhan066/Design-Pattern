package SolidPrinciple.LiskovSubstitutionPrinciple;

public class Macbook implements Laptop{
    boolean isDeviceOn;
    boolean bluetoothOn;

    @Override
    public void turnOnDevice() {
        isDeviceOn=true;
    }

    public void connectToAnotherDevice(){
        bluetoothOn=true;
    }
}
