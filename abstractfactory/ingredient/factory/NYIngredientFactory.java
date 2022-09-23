package abstractfactory.ingredient.factory;

import abstractfactory.ingredient.*;

public class NYIngredientFactory implements PizzaIngredientFactory{
    @Override
    public void createDough() {
        System.out.println(new NYDough().getName());
    }

    @Override
    public void createCheese() {
        System.out.println(new NYCheese().getName());
    }

    @Override
    public void createClam() {
        System.out.println(new NYClam().getName());
    }

    @Override
    public void createPepperoni() {
        System.out.println(new NYPepperoni().getName());
    }

    @Override
    public void createSauce() {
        System.out.println(new NYSauce().getName());
    }

    @Override
    public void createVeggie() {
        System.out.println(new NYVeggie().getName());
    }
}
