package StrategyPattern;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applied Black and White Effect on "+fileName);
    }
}
