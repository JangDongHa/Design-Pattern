package etc.strategy2;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Deer();
        cat.move();

        Animal dog = new Dog();
        dog.move();
    }
}
