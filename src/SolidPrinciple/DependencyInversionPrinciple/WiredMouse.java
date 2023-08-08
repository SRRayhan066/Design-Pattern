package SolidPrinciple.DependencyInversionPrinciple;

public class WiredMouse implements Mouse{

    @Override
    public void point() {
        System.out.println("Using wired mouse.");
    }
}
