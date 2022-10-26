package command.receiver;

public class KitchenLight implements Light {
    @Override
    public void on() {
        System.out.println("Kitchen light on");
    }

    @Override
    public void off() {
        System.out.println("Kitchen light off");
    }
}
