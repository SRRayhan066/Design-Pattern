package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder builder = new BurgerBuilder();
        Burger burger = builder.setMeatAmmount(10).setCheeseAmount(20).setLetusAmmount(10).build();

        System.out.println(burger.getMeat());
        System.out.println(burger.getCheese());
        System.out.println(burger.getLetus());
    }
}
