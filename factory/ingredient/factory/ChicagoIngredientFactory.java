package factory.ingredient.factory;

import factory.ingredient.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{
    @Override
    public void createDough() {
        System.out.println(new ChicagoDough().getName());
    }

    @Override
    public void createCheese() {
        System.out.println(new ChicagoCheese().getName());
    }

    @Override
    public void createClam() {
        System.out.println(new ChicagoClam().getName());
    }

    @Override
    public void createPepperoni() {
        System.out.println(new ChicagoPepperoni().getName());
    }

    @Override
    public void createSauce() {
        System.out.println(new ChicagoSauce().getName());
    }

    @Override
    public void createVeggie() {
        System.out.println(new ChicagoVeggie().getName());
    }
}
