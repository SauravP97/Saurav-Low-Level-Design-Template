package commandpattern.headfirst.command;

import commandpattern.headfirst.device.CeilingFan;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    CeilingFan.SPEED previousSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case HIGH:
                ceilingFan.high();
            case MEDIUM:
                ceilingFan.medium();
            case LOW:
                ceilingFan.low();
            case OFF:
                ceilingFan.off();    
        }
    }
}