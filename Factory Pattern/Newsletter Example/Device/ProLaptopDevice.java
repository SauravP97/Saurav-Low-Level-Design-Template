package factory.newsletter.device;

import factory.newsletter.device.Device;

public class ProLaptopDevice extends Device {
    public ProLaptopDevice() {
        this.name = "Pro Laptop Device";
    }

    public void viewConfiguration() {
        System.out.println("=====================\n");
        System.out.println("Configuration for Pro Laptop Device: ");
        System.out.println("16 inch Full HDR Display");
        System.out.println("16 GB RAM");
        System.out.println("M1 chipset");
        System.out.println("=====================\n");
    }
}