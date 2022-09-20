package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Espresso(Size.TALL));
        System.out.println(beverage.getDescription());
        System.out.printf("가격 : %.2f$\n", beverage.cost());

        Beverage beverage1 = new Houseblend(Size.GRANDE);

        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription());
        System.out.printf("가격 : %.2f$\n", beverage1.cost());
    }
}
