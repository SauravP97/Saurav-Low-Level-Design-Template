package facade.gamingstation;

import facade.components.AudioBox;
import facade.components.Display;
import facade.components.Xbox;
import facade.components.Lights;

public class GamingStation {
    private AudioBox audioBox;
    private Display display;
    private Xbox xbox;
    private Lights lights;

    public GamingStation(
        AudioBox audioBox, Display display, Xbox xbox, Lights lights) {
        this.audioBox = audioBox;
        this.display = display;
        this.xbox = xbox;
        this.lights = lights;
    }

    public void powerOnGamingStation() {
        this.xbox.switchOn();
        this.display.powerOn();
        this.lights.switchOn();
        this.audioBox.turnOn();
        System.out.println("Gaming Station powered On!");
        System.out.println();
    }

    public void powerOffGamingStation() {
        this.xbox.switchOff();
        this.display.powerOff();
        this.lights.switchOff();
        this.audioBox.turnOff();
        System.out.println("Gaming Station powered Off!");
        System.out.println();
    }
}