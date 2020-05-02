package factory_pattern.abstract_factory.product_b;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:53
 */
abstract public class ProductB {

    private String name;

    public ProductB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public abstract void produce();
}
