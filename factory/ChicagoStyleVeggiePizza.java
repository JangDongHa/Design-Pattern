package factory;

import factory.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;

    }

    @Override
    public void prepare(){
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createVeggie();
    }

    @Override
    public void cut(){
        System.out.println("시카고 스타일 Veggie Cutting");
    }
}
