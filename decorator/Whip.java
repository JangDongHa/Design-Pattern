package decorator;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost(){
        return beverage.cost() + .40;
    }

    @Override
    Size getSize() {
        return this.size;
    }
}
