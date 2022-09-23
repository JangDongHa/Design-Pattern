package factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaFactory("cheese");
        pizzaStore.prepare();
    }
}
