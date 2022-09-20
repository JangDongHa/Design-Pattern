package factory;

import factory.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createClam();
    }

    @Override
    public void bake(){
        System.out.println("시카고 스타일 Clam bake");
    }
}
