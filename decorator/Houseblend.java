package decorator;

public class Houseblend extends Beverage{

    public Houseblend(Size size){
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        double cost = .89;
        if (size == Size.TALL)
            return cost + 0.2;
        else if (size == Size.GRANDE)
            return cost + 0.5;
        else if (size == Size.VENTI)
            return cost + 0.7;
        return .89 + getSizePrice();
    }


    @Override
    Size getSize() {
        return this.size;
    }
}
