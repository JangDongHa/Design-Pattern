package command;

import command.command.Command;

import java.util.Arrays;

public class SimpleRemoteControl {
    Command[] slot;

    public void setCommand(Command[] command){
        slot = command;
    }

    public void allButtonWasPressed(){
        Arrays.stream(slot).forEach(Command::execute);
    }



    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-- Remote Control --\n");
        for (int slotNumber = 1; slotNumber < slot.length; slotNumber++) {
            stringBuffer.append("slot " + slotNumber + " : "  + slot[slotNumber].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
