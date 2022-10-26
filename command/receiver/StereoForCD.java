package command.receiver;

public class StereoForCD implements Stereo{
    @Override
    public void on() {
        System.out.println("StereoForCD is on");
    }

    @Override
    public void off() {
        System.out.println("StereoForCD is off");
    }
}
