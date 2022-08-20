package etc.strategy;

import etc.strategy.capsulation.FlyWithWings;
import etc.strategy.capsulation.Squeak;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck : 청둥오리");
    }
}
