package decorator;

public class Espresso extends Beverage{

    public Espresso(Size size){
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99 + getSizePrice();
    }


    @Override
    public Size getSize() {
        return this.size;
    }

}
