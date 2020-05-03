package command_pattern.devices;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/4 0:02
 */
public class SecondDevice {

    private String name;

    public SecondDevice(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " has been started");
    }

    public void off() {
        System.out.println(name + " has been stoped");
    }
}
