package decorator;

public class RecentLaw implements Law{

    @Override
    public double getSizePrice(Size size) {
        if (size == Size.TALL)
            return 0.2;
        else if (size == Size.GRANDE)
            return 0.5;
        else
            return 0.7;
    }
}
