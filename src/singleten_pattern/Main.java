package singleten_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 21:09
 */
public class Main {


    public static void main(String[] args) throws Exception {
        UnsafeSingleten unsafeSingleten = UnsafeSingleten.getInstance();

        SafeSingletenA safeSingletenA = SafeSingletenA.getInstance();

        SafeSingletonB safeSingletonB = SafeSingletonB.getInstance();

        UnsafeSingleten.getInstance();
        SafeSingletonB.getInstance();
        SafeSingletenA.getInstance();
    }

}
