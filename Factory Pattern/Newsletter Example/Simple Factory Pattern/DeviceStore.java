package factory.newsletter.simplefactory;

import factory.newsletter.device.Device;
import factory.newsletter.simplefactory.SimpleDeviceFactory.DeviceType;
import factory.newsletter.simplefactory.SimpleDeviceFactory;

public class DeviceStore {
    SimpleDeviceFactory factory;

    public DeviceStore(SimpleDeviceFactory factory) {
        this.factory = factory;
    }

    Device orderDevice(DeviceType deviceType) {
        Device device = this.factory.createDevice(deviceType);    
        
        device.viewConfiguration();
        device.box();
        device.ship();

        return device;
    }
}