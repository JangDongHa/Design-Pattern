package command;

import command.command.*;
import command.receiver.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SimpleRemoteControl remoteControl = new SimpleRemoteControl(); // Invoker
//        Light light = new Light(); // Receiver
//        LightOnCommand lightOnCommand = new LightOnCommand(light); // Commander
//
//        remoteControl.setCommand(lightOnCommand);
//        remoteControl.buttonWasPressed();

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        // Receiver
        LivingRoomLight livingRoomLight = new LivingRoomLight();
        KitchenLight kitchenLight = new KitchenLight();
        LivingRoomCeilingFan livingRoomCeilingFan = new LivingRoomCeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        StereoForCD stereoForCD = new StereoForCD();
        AllLight allLight = new AllLight();

        // Command
        List<Command> commands = new ArrayList<>();
        commands.add(new LightOnCommand(livingRoomLight));
        commands.add(new LightOffCommand(livingRoomLight));
        commands.add(new LightOnCommand(kitchenLight));
        commands.add(new LightOffCommand(kitchenLight));
        commands.add(new FanHighCommand(livingRoomCeilingFan));
        commands.add(new FanOffCommand(livingRoomCeilingFan));
        commands.add(new DoorOpenCommand(garageDoor));
        commands.add(new DoorCloseCommand(garageDoor));
        commands.add(new StereoOnCommand(stereoForCD));
        commands.add(new StereoOffCommand(stereoForCD));
        commands.add(new LightOnCommand(allLight));
        commands.add(new LightOffCommand(allLight));

        simpleRemoteControl.setCommand(commands.toArray(new Command[0]));

        //simpleRemoteControl.buttonWasPressed()
        System.out.println(simpleRemoteControl);
    }
}
