package abstractfactory;

import abstractfactory.ingredient.factory.NYIngredientFactory;
import abstractfactory.ingredient.factory.PizzaIngredientFactory;

import java.util.HashMap;

public class NYStylePizzaStore extends PizzaStore{
    private HashMap<String, Pizza> typeMap;
    private PizzaIngredientFactory pizzaIngredientFactory;
    public NYStylePizzaStore(){
        this.pizzaIngredientFactory = new NYIngredientFactory();
        typeMap = new HashMap<>();
        typeMap.put("cheese", new NYStyleCheesePizza(pizzaIngredientFactory));
    }
    @Override
    protected Pizza createPizza(String type) {
        return typeMap.get(type);
    }
}
