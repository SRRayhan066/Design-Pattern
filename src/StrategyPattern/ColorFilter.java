package StrategyPattern;

public class ColorFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applied Color Filter on "+fileName);
    }
}
