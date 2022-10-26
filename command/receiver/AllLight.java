package command.receiver;

public class AllLight implements Light{
    @Override
    public void on() {
        System.out.println("All lights on");
    }

    @Override
    public void off() {
        System.out.println("All lights off");
    }
}
