package command_pattern.commands;

import command_pattern.Command;
import command_pattern.devices.SecondDevice;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/4 0:04
 */
public class SecondDeviceOnCommand implements Command {

    SecondDevice device;

    public SecondDeviceOnCommand(SecondDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
