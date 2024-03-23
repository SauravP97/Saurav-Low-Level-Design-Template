package facade;

import facade.components.AudioBox;
import facade.components.Display;
import facade.components.Xbox;
import facade.components.Lights;
import facade.gamingstation.GamingStation;

public class Runner {
    public static void main(String[] args) {
        // Initialize all the sub components;
        AudioBox audioBox = new AudioBox();
        Display display = new Display();
        Xbox xbox = new Xbox();
        Lights lights = new Lights();

        // Start the Gaming Station.
        GamingStation gamingstation = 
            new GamingStation(audioBox, display, xbox, lights);

        // Power On the Gaming Station.
        gamingstation.powerOnGamingStation();

        // Power Off the Gaming Station.
        gamingstation.powerOffGamingStation();
    }
}