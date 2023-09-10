package factory.newsletter.simplefactory;

import factory.newsletter.device.Device;
import factory.newsletter.device.MobileDevice;
import factory.newsletter.device.WearableDevice;
import factory.newsletter.device.LaptopDevice;

public class SimpleDeviceFactory {
    enum DeviceType {
        MOBILE,
        WEARABLE,
        LAPTOP
    }

    public Device createDevice(DeviceType deviceType) {
        Device device = null;

        switch (deviceType) {
            case MOBILE:
                device = new MobileDevice();
                break;
            case WEARABLE:
                device = new WearableDevice();
                break;
            case LAPTOP:
                device = new LaptopDevice();
                break;
            default:
                break;    
        }

        return device;
    }
}