package SolidPrinciple.InterfaceSeggregationPrinciple;

public class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("Cooking Food.");
    }
}
