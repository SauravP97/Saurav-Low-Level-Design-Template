package factory.newsletter.simplefactory;

import factory.newsletter.device.Device;
import factory.newsletter.simplefactory.SimpleDeviceFactory.DeviceType;

public class Runner {
    public static void main(String[] args) {
        // Initializing a Device Store
        SimpleDeviceFactory factory = new SimpleDeviceFactory();
        DeviceStore deviceStore = new DeviceStore(factory);

        // Ordering a Mobile Device
        Device mobileDevice = deviceStore.orderDevice(DeviceType.MOBILE);
        System.out.println("Device Ordered: " + mobileDevice.getName());

        System.out.println("\n====================== \n");

        // Ordering a Laptop Device
        Device laptopDevice = deviceStore.orderDevice(DeviceType.LAPTOP);
        System.out.println("Device Ordered: " + laptopDevice.getName());
    }
}