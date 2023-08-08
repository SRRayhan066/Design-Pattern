package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JPEGCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("My Photo");
    }
}
