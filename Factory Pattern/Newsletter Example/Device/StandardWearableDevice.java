package factory.newsletter.device;

import factory.newsletter.device.Device;

public class StandardWearableDevice extends Device {
    public StandardWearableDevice() {
        this.name = "Standard Wearable device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Standard Wearable Device: ");
        System.out.println("2 inch Standard Display");
        System.out.println("Heart Beat measurement support");
        System.out.println("10+ Wrokout Activity tracking");
        System.out.println("=====================\n");
    }
}