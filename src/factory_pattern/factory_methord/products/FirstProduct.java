package factory_pattern.factory_methord.products;

import factory_pattern.factory_methord.Product;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:36
 */
public class FirstProduct extends Product {

    public FirstProduct(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("First Product Preparing");
    }

    @Override
    public void produce() {
        System.out.println("First Product has been produced");

    }
}
