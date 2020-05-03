package command_pattern.devices;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 23:59
 */
public class FirstDevice {

    private String name;

    public FirstDevice(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " has been started");
    }

    public void off() {
        System.out.println(name + " has been stoped");
    }

    public void test() {
        System.out.println(name + " is testing");
    }
}
