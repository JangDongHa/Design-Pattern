package decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    public double cost(){
        return beverage.cost() + .50;
    }


    @Override
    Size getSize() {
        return this.size;
    }
}
