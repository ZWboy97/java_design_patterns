package command_pattern;

import command_pattern.commands.FirstDeveiceOffCommand;
import command_pattern.commands.FirstDeveiceOnCommand;
import command_pattern.commands.SecondDeviceOffCommand;
import command_pattern.commands.SecondDeviceOnCommand;
import command_pattern.devices.FirstDevice;
import command_pattern.devices.SecondDevice;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 23:57
 */
public class Main {


    public static void main(String [] args)throws Exception{

        ControlPanel controlPanel = new ControlPanel();

        FirstDevice device1 = new FirstDevice("device1");

        controlPanel.setCommand(new FirstDeveiceOnCommand(device1));
        controlPanel.onClick();
        controlPanel.setCommand(new FirstDeveiceOffCommand(device1));
        controlPanel.onClick();

        SecondDevice device2 = new SecondDevice("device2");

        controlPanel.setCommand(new SecondDeviceOnCommand(device2));
        controlPanel.onClick();
        controlPanel.setCommand(new SecondDeviceOffCommand(device2));
        controlPanel.onClick();
    }

}
