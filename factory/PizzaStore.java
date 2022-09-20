package factory;

import java.util.HashMap;

public abstract class PizzaStore {
    HashMap<String, Pizza> type;

    public PizzaStore(){

    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        if (pizza == null)
            throw new RuntimeException("피자명을 찾을 수 없습니다.");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    protected abstract Pizza createPizza(String type);
}
