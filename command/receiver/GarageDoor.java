package command.receiver;

public class GarageDoor implements Door{
    @Override
    public void open() {
        System.out.println("Garage door is open");
    }

    @Override
    public void close() {
        System.out.println("Garage door is closed");
    }
}
