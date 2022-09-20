package factory;

import factory.ingredient.factory.ChicagoIngredientFactory;
import factory.ingredient.factory.PizzaIngredientFactory;

import java.util.HashMap;

public class ChicagoStylePizzaStore extends PizzaStore{
    private final HashMap<String, Pizza> typeMap;

    public ChicagoStylePizzaStore(){
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
        typeMap = new HashMap<>();
        typeMap.put("cheese", new ChicagoStyleCheesePizza(pizzaIngredientFactory));
        typeMap.put("clam", new ChicagoStyleClamPizza(pizzaIngredientFactory));
        typeMap.put("veggie", new ChicagoStyleVeggiePizza(pizzaIngredientFactory));
        typeMap.put("pepperoni", new ChicagoStylePepperoniPizza(pizzaIngredientFactory));
    }

    @Override
    protected Pizza createPizza(String type) {
        return typeMap.get(type);
    }
}
