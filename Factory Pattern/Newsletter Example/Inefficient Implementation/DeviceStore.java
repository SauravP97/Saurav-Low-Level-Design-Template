package factory.newsletter.inefficient;

import factory.newsletter.device.Device;
import factory.newsletter.device.MobileDevice;
import factory.newsletter.device.WearableDevice;
import factory.newsletter.device.LaptopDevice;

public class DeviceStore {
    enum DeviceType {
        MOBILE,
        WEARABLE,
        LAPTOP
    }

    Device orderDevice(DeviceType deviceType) {
        Device device;

        switch (deviceType) {
            case MOBILE:
                device = new MobileDevice();
                prepareDevice(device);
                return device;
            case WEARABLE:
                device = new WearableDevice();
                prepareDevice(device);
                return device;
            case LAPTOP:
                device = new LaptopDevice();
                prepareDevice(device);
                return device;
        }

        throw new AssertionError("Invalid or Unknown Device type");
    }

    private void prepareDevice(Device device) {
        device.viewConfiguration();
        device.box();
        device.ship();
    }
}