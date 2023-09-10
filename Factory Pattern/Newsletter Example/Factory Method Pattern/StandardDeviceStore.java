package factory.newsletter.factorymethod;

import factory.newsletter.factorymethod.DeviceStore;
import factory.newsletter.factorymethod.DeviceStore.DeviceType;
import factory.newsletter.device.Device;
import factory.newsletter.device.StandardMobileDevice;
import factory.newsletter.device.StandardWearableDevice;
import factory.newsletter.device.StandardLaptopDevice;

public class StandardDeviceStore extends DeviceStore {

    public Device createDevice(DeviceType deviceType) {
        switch (deviceType) {
            case MOBILE:
                return new StandardMobileDevice();
            case WEARABLE:
                return new StandardWearableDevice();
            case LAPTOP:
                return new StandardLaptopDevice();
        }

        throw new AssertionError("Invalid or Unknown Device type");
    }
}