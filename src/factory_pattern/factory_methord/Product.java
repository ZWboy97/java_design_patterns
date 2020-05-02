package factory_pattern.factory_methord;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:33
 */
abstract public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public abstract void produce();

}
