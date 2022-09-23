package factory;

public abstract class PizzaStore {
    String type;

    public PizzaStore(String type){
        this.type = type;
    }

    public void prepare(){ // 상위 클래스에서 행동을 제어
        Pizza pizza = getPizza(type);

        pizza.prepare();

        pizza.bake();
        pizza.cook();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza getPizza(String type);
}
