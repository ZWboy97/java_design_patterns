package factory_pattern.abstract_factory.product_b;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:57
 */
public class SecondProductB extends ProductB {

    public SecondProductB(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Second Product Preparing");

    }

    @Override
    public void produce() {
        System.out.println("Second Product has been produced");

    }
}
