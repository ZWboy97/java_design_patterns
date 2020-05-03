package command_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 23:59
 */
public class ControlPanel {

    Command command;

    public ControlPanel() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }
}
