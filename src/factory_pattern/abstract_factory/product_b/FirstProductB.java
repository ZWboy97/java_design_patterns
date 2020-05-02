package factory_pattern.abstract_factory.product_b;

import factory_pattern.abstract_factory.product_b.ProductB;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:56
 */
public class FirstProductB extends ProductB {
    public FirstProductB(String name) {
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
