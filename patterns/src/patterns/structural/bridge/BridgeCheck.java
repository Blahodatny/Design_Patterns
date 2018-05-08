package patterns.structural.bridge;

import patterns.structural.bridge.devices.Radio;
import patterns.structural.bridge.devices.TV;
import patterns.structural.bridge.devices.interfaces.IDevice;
import patterns.structural.bridge.remotes.AdvancedRemote;
import patterns.structural.bridge.remotes.BasicRemote;

public class BridgeCheck {
    public static void check() {
        testDevice(new Radio());
        testDevice(new TV());
    }

    private static void testDevice(IDevice device) {
        var basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        var advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}