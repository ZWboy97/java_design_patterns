package factory_pattern.factory_methord.products;

import factory_pattern.factory_methord.Product;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:38
 */
public class SecondProduct extends Product {

    public SecondProduct(String name) {
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
