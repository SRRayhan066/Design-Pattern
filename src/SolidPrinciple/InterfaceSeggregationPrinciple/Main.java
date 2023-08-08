package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Main {
    public static void main(String[] args) {
        VideoInterface video = new Video();
        SoundSystemInterface sound = new Volume();

        video.playVideo("VLC");
        sound.setVolume(10);

    }
}
