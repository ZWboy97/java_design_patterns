package command_pattern.commands;

import command_pattern.Command;
import command_pattern.devices.FirstDevice;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/4 0:02
 */
public class FirstDeveiceOnCommand implements Command {

    FirstDevice device;

    public FirstDeveiceOnCommand(FirstDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.test();
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
