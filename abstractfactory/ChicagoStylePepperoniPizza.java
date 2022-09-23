package abstractfactory;

import abstractfactory.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createPepperoni();
        pizzaIngredientFactory.createSauce();
    }

    @Override
    public void box(){
        System.out.println("시카고 페퍼로니 boxing");
    }
}
