package decorator;

public abstract class Beverage {
    Size size;
    abstract String getDescription();

    abstract double cost();

    abstract Size getSize();

    double getSizePrice(){
        if (size == Size.TALL)
            return 0.2;
        else if (size == Size.GRANDE)
            return 0.5;
        else
            return 0.7;
    }
}
