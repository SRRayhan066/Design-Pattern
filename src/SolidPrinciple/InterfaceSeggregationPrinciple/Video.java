package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Video implements VideoInterface{
    String videoPlayer;
    @Override
    public void playVideo(String videoPlayer) {
        this.videoPlayer=videoPlayer;
    }
}
