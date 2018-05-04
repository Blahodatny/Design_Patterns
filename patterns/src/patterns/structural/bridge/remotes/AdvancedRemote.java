package patterns.structural.bridge.remotes;

import patterns.structural.bridge.devices.interfaces.IDevice;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(IDevice device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}