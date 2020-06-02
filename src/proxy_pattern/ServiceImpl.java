package proxy_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/2 15:05
 */
public class ServiceImpl implements Service {

    @Override
    public void doSomething() {
        System.out.println("我给你提供服务了");
    }

    @Override
    public void notDoSomething() {
        System.out.println("不允许执行");
    }
}
