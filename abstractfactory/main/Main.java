package abstractfactory.main;

import abstractfactory.ChicagoStylePizzaStore;
import abstractfactory.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();

        pizzaStore.orderPizza("clam");
        System.out.println("=================================");
        pizzaStore.orderPizza("pepperoni");
    }
}
