package factory;

import java.util.HashMap;
import java.util.Map;

public class ChicagoPizzaFactory extends PizzaStore{
    Map<String, Pizza> pizzaMap;

    public ChicagoPizzaFactory(String type){
        super(type);
        pizzaMap = new HashMap<>();
        pizzaMap.put("cheese", new ChicagoCheesePizza());
        pizzaMap.put("pepperoni", new ChicagoPepperoniPizza());
    }

    @Override
    Pizza getPizza(String type) {
        return pizzaMap.get(type);
    }
}
