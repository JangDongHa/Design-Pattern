package factory.ingredient.factory;

import factory.ingredient.*;

public interface PizzaIngredientFactory {
    void createDough();
    void createCheese();
    void createClam();
    void createPepperoni();
    void createSauce();
    void createVeggie();
}
