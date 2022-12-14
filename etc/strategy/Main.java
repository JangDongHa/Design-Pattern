package etc.strategy;

import etc.strategy.capsulation.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        duck.display();


        Duck duck2 = new RedHeadDuck();
        duck2.fly();
        duck2.quack();
        duck2.display();
        duck2.setFlyBehavior(new FlyWithWings());
    }
}
