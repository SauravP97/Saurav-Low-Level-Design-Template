package factory.newsletter.factorymethod;

import factory.newsletter.device.Device;
import factory.newsletter.factorymethod.DeviceStore.DeviceType;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n ====================== \n");

        // Ordering a Pro Mobile Device
        ProDeviceStore proDeviceStore = new ProDeviceStore();
        Device proMobileDevice = proDeviceStore.orderDevice(DeviceType.MOBILE);
        System.out.println("Oredered Device: " + proMobileDevice.getName());

        System.out.println("\n ====================== \n");

        // Ordering a Standard Wearable Device
        StandardDeviceStore standardDeviceStore = new StandardDeviceStore();
        Device standardWearableDevice = standardDeviceStore.orderDevice(DeviceType.WEARABLE);
        System.out.println("Oredered Device: " + standardWearableDevice.getName());

        System.out.println("\n ====================== \n");

        // Ordering a Pro Laptop Device
        Device proLaptopDevice = proDeviceStore.orderDevice(DeviceType.LAPTOP);
        System.out.println("Oredered Device: " + proLaptopDevice.getName());

        System.out.println("\n ====================== \n");
    }
}