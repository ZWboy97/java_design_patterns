package adapter_pattern.adapter;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:08
 */
public class Adapter implements TargetInterface {

    AdapteeClass adaptee;

    public Adapter(AdapteeClass adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void say() {
        this.adaptee.reportName();
    }
}
