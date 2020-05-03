package singleten_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/3 21:11
 */
public class UnsafeSingleten {

    private static UnsafeSingleten instance;

    private String message;

    private UnsafeSingleten() {
        System.out.println("Create unsafe singleten success!");
    }

    public static UnsafeSingleten getInstance() {
        if (instance == null) {
            instance = new UnsafeSingleten();
        }
        return instance;
    }


}
