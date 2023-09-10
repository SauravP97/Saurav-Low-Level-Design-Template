package factory.newsletter.device;

import factory.newsletter.device.Device;

public class ProMobileDevice extends Device {
    public ProMobileDevice() {
        this.name = "Pro Mobile device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Pro Mobile Device: ");
        System.out.println("5.5 inch HD XDR Display");
        System.out.println("16 GB RAM");
        System.out.println("128 GB Storage");
        System.out.println("=====================\n");
    }
}