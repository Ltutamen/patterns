package ua.axiom.structural.bridge;

public class Bridge {
    private Device device;

    public void togglePower() {
        if(device.isEnabled()) {
            device.disable();
        }
        else {
            device.enable();
        }
    }

    public void volumeDown() {
        int current = device.getVolume();

        if(current < 0) {
            current = 0;
        } else if(current < 5) {
            current -= 1;
        } else  {
            current -= 5;
        }

        device.setVolume(current);
    }

    public void volumeUp() {
        int current = device.getVolume();

        if(current > 99) {
            current = 99;
        } else if(current > 94) {
            current += 1;
        } else {
            current += 5;
        }

        device.setVolume(current);
    }

    void channelUp() {
        //  ...
    }

    void channelDown() {
        //  ...
    }

}
