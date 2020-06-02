package proxy_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/2 15:06
 */
public class Proxy {

    private Service service;

    public Proxy() {
        this.service = new ServiceImpl();
    }

    void doSomething(){
        this.service.doSomething();
    }
}
