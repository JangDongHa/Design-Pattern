package command.receiver;

public class LivingRoomCeilingFan implements Fan{
    @Override
    public void high() {
        System.out.println("Living room ceiling fan high");
    }

    @Override
    public void off() {
        System.out.println("Living room ceiling fan off");
    }
}
