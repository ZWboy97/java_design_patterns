package factory_pattern.factory_methord.stores;

import factory_pattern.factory_methord.Product;
import factory_pattern.factory_methord.BaseStore;
import factory_pattern.factory_methord.products.FirstProduct;
import factory_pattern.factory_methord.products.SecondProduct;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:43
 */
public class FirstStore extends BaseStore {

    @Override
    public Product createProduct(String type) {
        if (type == "first") {
            return new FirstProduct("P1");
        } else if (type == "second") {
            return new SecondProduct("P2");
        }
        return null;
    }
}
