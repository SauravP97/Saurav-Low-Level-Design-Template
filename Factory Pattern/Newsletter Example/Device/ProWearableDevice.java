package factory.newsletter.device;

import factory.newsletter.device.Device;

public class ProWearableDevice extends Device {
    public ProWearableDevice() {
        this.name = "Pro Wearable device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Pro Wearable Device: ");
        System.out.println("2.5 inch Fulld HD Display");
        System.out.println("Heart Beat measurement and Blood Oxygen support");
        System.out.println("50+ Wrokout Activity tracking");
        System.out.println("=====================\n");
    }
}