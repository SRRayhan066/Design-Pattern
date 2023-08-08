package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        LaptopBuilder builder = new LaptopBuilder();
        Laptop laptop = builder.setName("Asus").setModel("Zen 5").setColor("Silver").build();

        System.out.println(laptop.getName());
        System.out.println(laptop.getModel());
        System.out.println(laptop.getColor());
    }
}
