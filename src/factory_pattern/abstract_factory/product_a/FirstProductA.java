package factory_pattern.abstract_factory.product_a;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:54
 */
public class FirstProductA extends ProductA {

    public FirstProductA(String name) {
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
