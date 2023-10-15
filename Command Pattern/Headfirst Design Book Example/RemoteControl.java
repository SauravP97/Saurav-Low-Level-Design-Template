package commandpattern.headfirst;

import commandpattern.headfirst.command.Command;
import commandpattern.headfirst.command.NoCommand;

public class RemoteControl {
    private static final int SLOT_SIZE = 7;

    Command[] offCommands;
    Command[] onCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_SIZE];
        offCommands = new Command[SLOT_SIZE];

        NoCommand noCommand = new NoCommand();

        for (int i=0; i<SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ----- Remote Control ----- \n");
        for (int i=0; i<SLOT_SIZE; i++) {
            stringBuffer.append(
                "[Slot " + i + "]: " 
                + onCommands[i].getClass().getName() 
                + " -- " + offCommands[i].getClass().getName() + "\n");
        }
        
        return stringBuffer.toString();
    }
}