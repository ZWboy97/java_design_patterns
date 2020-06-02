package proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/2 15:12
 */
public class ServiceInvocationHandler implements InvocationHandler {

    private Service service;

    public ServiceInvocationHandler(Service service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("notDoSomething")){
            System.out.println("你不能执行这个方法");
        }else if(method.getName().equalsIgnoreCase("dosomething")){
            method.invoke(service,args);
        }
        return null;
    }
}
