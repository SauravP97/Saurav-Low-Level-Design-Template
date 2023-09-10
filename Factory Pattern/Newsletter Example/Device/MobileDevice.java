package factory.newsletter.device;

import factory.newsletter.device.Device;

public class MobileDevice extends Device {
    public MobileDevice() {
        this.name = "Mobile Device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Mobile Device: ");
        System.out.println("5 inch Standard Display");
        System.out.println("8 GB RAM");
        System.out.println("64 GB Storage");
        System.out.println("=====================\n");
    }
}