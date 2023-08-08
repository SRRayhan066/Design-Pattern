package BuilderPattern;

public class LaptopBuilder {
    private Laptop laptop;
    public LaptopBuilder(){
        this.laptop = new Laptop();
    }
    public LaptopBuilder setName(String name){
        laptop.setName(name);
        return this;
    }
    public LaptopBuilder setModel(String model){
        laptop.setModel(model);
        return this;
    }
    public LaptopBuilder setColor(String color){
        laptop.setColor(color);
        return this;
    }
    public Laptop build(){
        return laptop;
    }
}
