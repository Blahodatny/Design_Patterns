package patterns.structural.bridge.remotes;

import patterns.structural.bridge.devices.interfaces.IDevice;
import patterns.structural.bridge.remotes.interfaces.IRemote;

public class BasicRemote implements IRemote {
    IDevice device;

    BasicRemote() {
    }

    public BasicRemote(IDevice device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}