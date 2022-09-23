package factory;

public class NYPizzaFactory extends PizzaStore{

    public NYPizzaFactory(String type){
        super(type);
    }

    @Override
    Pizza getPizza(String type) {
        return null;
    }
}
