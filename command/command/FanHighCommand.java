package command.command;

import command.receiver.Fan;

public class FanHighCommand implements Command{
    private Fan fan;
    public FanHighCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}
