package adapter_pattern.appearance;

import adapter_pattern.appearance.devices.Device1;
import adapter_pattern.appearance.devices.Device2;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:17
 */
public class Operation implements GroupOperation {

    private Device1 device1;
    private Device2 device2;

    public Operation(Device1 device1, Device2 device2) {
        this.device1 = device1;
        this.device2 = device2;
    }

    @Override
    public void getUp() {
        this.device1.on();
        this.device2.setOff();
    }

    @Override
    public void getOff() {
        this.device1.off();
        this.device2.setOff();
    }
}
