package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Volume implements SoundSystemInterface{
    private int volume;
    @Override
    public void setVolume(int volume) {
        this.volume=volume;
    }
}
