package abstractfactory;

import abstractfactory.ingredient.factory.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    List<String> toppings = new ArrayList<>();
    abstract void prepare();

    void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut(){
        System.out.println("피자를 사선으로 자르기");
    }

    void box(){
        System.out.println("상자에 피자 담기");
    }

}
