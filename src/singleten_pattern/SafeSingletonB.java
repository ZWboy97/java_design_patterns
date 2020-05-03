package singleten_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 21:16
 */
public class SafeSingletonB {

    private static SafeSingletonB instance;

    private SafeSingletonB() {
        System.out.println("Create safe singleten B success!");

    }

    public static SafeSingletonB getInstance() {
        if (instance == null) {
            instance = SafeSingletonBHolder.instance;
        }
        return instance;
    }

    private static class SafeSingletonBHolder {
        public static SafeSingletonB instance = new SafeSingletonB();
    }

}
