package decorator;

// Decorator 는 행동을 상속하기 위해 추상 클래스를 사용하는 것이 아닌
// 이전의 상태를 가져오기 위해 사용
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; // 이전 형태를 알기 위해서 추상 클래스를 사용하는 건 OK
    // 중요한 건 행동에 대해서는 되도록이면 abstract 로 해야 함
    //
    abstract String getDescription();
}
