package factory.newsletter.inefficient;

import factory.newsletter.device.Device;
import factory.newsletter.inefficient.DeviceStore;
import factory.newsletter.inefficient.DeviceStore.DeviceType;

public class Runner {
    public static void main(String[] args) {
        // Initializing a Device Store
        DeviceStore deviceStore = new DeviceStore();

        // Ordering a Mobile Device
        Device mobileDevice = deviceStore.orderDevice(DeviceType.MOBILE);
        System.out.println("Device Ordered: " + mobileDevice.getName());

        System.out.println("\n ====================== \n");

        // Ordering a Wearable Device
        Device wearableDevice = deviceStore.orderDevice(DeviceType.WEARABLE);
        System.out.println("Device Ordered: " + wearableDevice.getName());
    }
}