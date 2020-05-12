package adapter_pattern.adapter;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:04
 */
public class TargetClass {

    TargetInterface client;

    public TargetClass(TargetInterface client) {
        this.client = client;
    }

    public void run() {
        this.client.say();
    }
}
