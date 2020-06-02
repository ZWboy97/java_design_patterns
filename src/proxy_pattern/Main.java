package proxy_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/2 11:57
 */
public class Main {



    public static void main(String []args) throws Exception{
        Proxy proxy = new Proxy();
        proxy.doSomething();

        Service service = new ServiceImpl();
        ServiceInvocationHandler handler = new ServiceInvocationHandler(service);
        Service serviceProxy = (Service)java.lang.reflect.Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                handler);

        serviceProxy.doSomething();
        serviceProxy.notDoSomething();


    }

}
