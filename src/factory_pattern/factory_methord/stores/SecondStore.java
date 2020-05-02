package factory_pattern.factory_methord.stores;

import factory_pattern.factory_methord.Product;
import factory_pattern.factory_methord.BaseStore;
import factory_pattern.factory_methord.products.FirstProduct;
import factory_pattern.factory_methord.products.SecondProduct;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:45
 */
public class SecondStore extends BaseStore {

    @Override
    public Product createProduct(String type) {
        if (type == "first") {
            return new FirstProduct("PA");
        } else if (type == "second") {
            return new SecondProduct("PB");
        }
        return null;
    }
}
