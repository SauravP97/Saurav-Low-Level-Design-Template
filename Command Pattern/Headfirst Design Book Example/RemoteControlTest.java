package commandpattern.headfirst;

import commandpattern.headfirst.device.CeilingFan;
import commandpattern.headfirst.device.Light;
import commandpattern.headfirst.device.GarageDoor;
import commandpattern.headfirst.command.LightOnCommand;
import commandpattern.headfirst.command.LightOffCommand;
import commandpattern.headfirst.command.Command;
import commandpattern.headfirst.command.MacroCommand;
import commandpattern.headfirst.command.GarageDoorUpCommand;
import commandpattern.headfirst.command.GarageDoorDownCommand;
import commandpattern.headfirst.command.CeilingFanHighCommand;
import commandpattern.headfirst.command.NoCommand;
import commandpattern.headfirst.RemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light("Kitchen");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        CeilingFan ceilingFan = new CeilingFan("Bed Room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        NoCommand noCommand = new NoCommand();

        Light bedRoomLight = new Light("Bed Room");
        LightOnCommand bedRoomLightOnCommand = new LightOnCommand(bedRoomLight); 
        Command[] chillCommands = {bedRoomLightOnCommand, garageDoorDownCommand, ceilingFanHighCommand};
        MacroCommand macroCommand = new MacroCommand(chillCommands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(2, ceilingFanHighCommand, noCommand);
        remoteControl.setCommand(3, macroCommand, noCommand);
        
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
    }
}