package factory_pattern.abstract_factory.product_a;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:53
 */
abstract public class ProductA {


    private String name;

    public ProductA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public abstract void produce();

}
