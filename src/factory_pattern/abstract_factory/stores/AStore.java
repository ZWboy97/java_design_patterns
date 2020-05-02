package factory_pattern.abstract_factory.stores;

import factory_pattern.abstract_factory.BaseStore;
import factory_pattern.abstract_factory.Factory;
import factory_pattern.abstract_factory.product_a.ProductA;
import factory_pattern.abstract_factory.product_b.ProductB;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 23:09
 */
public class AStore extends BaseStore {

    public AStore(Factory factory) {
        super(factory);
    }

    @Override
    public String createProducts(String type) {
        if (type == "first") {
            ProductA productA = getFactory().createProductA(type);
            ProductB productB = getFactory().createProductB(type);
            return productA.getName() + " + " + productB.getName();
        } else if (type == "second") {
            ProductA productA = getFactory().createProductA(type);
            ProductB productB = getFactory().createProductB(type);
            return productA.getName() + " + " + productB.getName();
        }
        return null;
    }
}
