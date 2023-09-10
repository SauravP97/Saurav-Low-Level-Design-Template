package factory.newsletter.factorymethod;

import factory.newsletter.factorymethod.DeviceStore;
import factory.newsletter.factorymethod.DeviceStore.DeviceType;
import factory.newsletter.device.Device;
import factory.newsletter.device.ProMobileDevice;
import factory.newsletter.device.ProWearableDevice;
import factory.newsletter.device.ProLaptopDevice;

public class ProDeviceStore extends DeviceStore {

    public Device createDevice(DeviceType deviceType) {
        switch (deviceType) {
            case MOBILE:
                return new ProMobileDevice();
            case WEARABLE:
                return new ProWearableDevice();
            case LAPTOP:
                return new ProLaptopDevice();
        }

        throw new AssertionError("Invalid or Unknown Device type");
    }
}