package factory.main;

import factory.ChicagoStylePizzaStore;
import factory.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();

        pizzaStore.orderPizza("clam");
        System.out.println("=================================");
        pizzaStore.orderPizza("pepperoni");
    }
}
