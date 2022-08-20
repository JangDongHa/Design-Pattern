package etc.strategy;

import etc.strategy.capsulation.FlyBehavior;
import etc.strategy.capsulation.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior; // Composition
    QuackBehavior quackBehavior;

    public Duck(){}

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public abstract void display();


}
