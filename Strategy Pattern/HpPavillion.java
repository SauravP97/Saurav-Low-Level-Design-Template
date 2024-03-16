package strategy;

import strategy.Computer;
import strategy.chipset.IntelChipset;
import strategy.graphics.NvidiaGeForce;

public class HpPavillion extends Computer {
    public HpPavillion() {
        super(new IntelChipset(), new NvidiaGeForce());
    }

    public void display() {
        System.out.println("Starting the display");
    }

    public void powerOn() {
        System.out.println("HP Pavillion Powering On!");
    }

    public void powerOff() {
        System.out.println("HP Pavillion Powering Off!");
    }
}