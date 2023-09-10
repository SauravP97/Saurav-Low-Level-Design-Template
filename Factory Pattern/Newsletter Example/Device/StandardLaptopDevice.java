package factory.newsletter.device;

import factory.newsletter.device.Device;

public class StandardLaptopDevice extends Device {
    public StandardLaptopDevice() {
        this.name = "Standard Laptop Device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Standard Laptop Device: ");
        System.out.println("13 inch Standard Display");
        System.out.println("8 GB RAM");
        System.out.println("Standard Intel chipset");
        System.out.println("=====================\n");
    }
}