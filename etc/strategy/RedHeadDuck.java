package etc.strategy;

import etc.strategy.capsulation.FlyNoWings;
import etc.strategy.capsulation.Squeak;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck : 빨간 머리 오리");
    }
}
