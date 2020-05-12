package adapter_pattern.appearance.devices;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:14
 */
public class Device1 {

    private String name;

    public Device1(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + "is on");
    }

    public void off() {
        System.out.println(this.name + " is off");
    }
}
