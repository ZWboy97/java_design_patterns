package command_pattern.commands;

import command_pattern.Command;
import command_pattern.devices.SecondDevice;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/4 0:04
 */
public class SecondDeviceOffCommand implements Command {

    SecondDevice device;

    public SecondDeviceOffCommand(SecondDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
