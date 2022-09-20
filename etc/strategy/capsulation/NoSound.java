package etc.strategy.capsulation;

public class NoSound implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("목소리를 낼 수 없습니다.");
    }
}
