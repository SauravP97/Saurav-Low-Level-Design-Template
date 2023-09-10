package factory.newsletter.device;

import factory.newsletter.device.Device;

public class LaptopDevice extends Device {
    public LaptopDevice() {
        this.name = "Laptop Device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Laptop Device: ");
        System.out.println("13 inch Standard Display");
        System.out.println("8 GB RAM");
        System.out.println("Standard Intel chipset");
        System.out.println("=====================\n");
    }
}