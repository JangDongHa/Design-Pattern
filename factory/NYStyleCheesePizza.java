package factory;

import factory.ingredient.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createSauce();
    }
}
