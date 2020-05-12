package adapter_pattern.appearance.devices;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:15
 */
public class Device2 {

    private String name;

    public Device2(String name) {
        this.name = name;
    }

    public void setOn() {
        System.out.println(this.name + " is set at on");
    }

    public void setOff() {
        System.out.println(this.name + " is set off");
    }
}
