package command.receiver;

public class LivingRoomLight implements Light{
    @Override
    public void on() {
        System.out.println("Living room light on");
    }

    @Override
    public void off() {
        System.out.println("Living room light off");
    }
}
