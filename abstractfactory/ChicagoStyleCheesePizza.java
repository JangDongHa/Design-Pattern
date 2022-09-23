package abstractfactory;

import abstractfactory.ingredient.factory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
    }

    @Override
    void cut(){
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
