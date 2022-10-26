package command.command;

import command.receiver.Stereo;

public class StereoOffCommand implements Command{
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
