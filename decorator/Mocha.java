package decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost(){
        return beverage.cost() + .20;
    }


    @Override
    Size getSize() {
        return this.size;
    }
}
