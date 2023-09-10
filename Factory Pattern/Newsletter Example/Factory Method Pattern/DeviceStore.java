package factory.newsletter.factorymethod;

import factory.newsletter.device.Device;

public abstract class DeviceStore {
    enum DeviceType {
        MOBILE,
        WEARABLE,
        LAPTOP
    }

    public Device orderDevice(DeviceType deviceType) {
        Device device = createDevice(deviceType);

        device.viewConfiguration();
        device.box();
        device.ship();

        return device;
    }

    protected abstract Device createDevice(DeviceType deviceType);
}