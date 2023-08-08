package StrategyPattern;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println(fileName+" is Compressing using JPEG");
    }
}
