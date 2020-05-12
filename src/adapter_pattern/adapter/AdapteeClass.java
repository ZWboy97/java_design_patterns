package adapter_pattern.adapter;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:04
 */
public class AdapteeClass {

    private String name;

    public AdapteeClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void reportName() {
        System.out.println("My name is " + this.name);
    }
}
