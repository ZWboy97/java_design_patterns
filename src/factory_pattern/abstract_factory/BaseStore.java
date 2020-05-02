package factory_pattern.abstract_factory;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 23:05
 */
abstract public class BaseStore {

    Factory factory;

    public BaseStore(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }

    public abstract String createProducts(String type);

    public void buyProduct(String type) {
        String products = createProducts(type);

        System.out.println("Buy product" + products + " success!");

    }
}
