package command_pattern.commands;

import command_pattern.Command;
import command_pattern.devices.FirstDevice;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/4 0:03
 */
public class FirstDeveiceOffCommand implements Command {

    FirstDevice device;

    public FirstDeveiceOffCommand(FirstDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();

    }

    @Override
    public void undo() {
        device.test();
        device.on();
    }
}
