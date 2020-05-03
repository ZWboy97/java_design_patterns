package singleten_pattern;

/**
 * 基于双重检查锁的线程安全的单例模式
 *
 * @Author: LiJiaChang
 * @Date: 2020/5/3 21:13
 */
public class SafeSingletenA {

    private volatile static SafeSingletenA instance; // volatile阻止对象创建中的重排序


    private SafeSingletenA() {
        System.out.println("Create safe singleten A success!");
    }

    public static SafeSingletenA getInstance() {

        if (instance == null) {
            synchronized (SafeSingletenA.class) {
                if (instance == null) {
                    instance = new SafeSingletenA();
                }
            }
        }
        return instance;
    }


}
