package BuilderPattern;

public class BurgerBuilder {
    private Burger burger;
    public BurgerBuilder(){
        this.burger = new Burger();
    }
    public BurgerBuilder setMeatAmmount(int meat){
        burger.setMeat(meat);
        return this;
    }
    public BurgerBuilder setCheeseAmount(int cheese){
        burger.setCheese(cheese);
        return this;
    }
    public BurgerBuilder setLetusAmmount(int letus){
        burger.setLetus(letus);
        return this;
    }
    public Burger build(){
        return burger;
    }
}
