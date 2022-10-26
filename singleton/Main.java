package singleton;

public class Main {
    public static void main(String[] args) {
        EnumChocolateBoiler chocolateBoiler = EnumChocolateBoiler.UNIQUE_INSTANCE;
        EnumChocolateBoiler chocolateBoiler1 = EnumChocolateBoiler.UNIQUE_INSTANCE;

        chocolateBoiler.setEmpty(true);
        System.out.println(chocolateBoiler1.isEmpty());
    }
}
