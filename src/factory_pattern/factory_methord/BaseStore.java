package factory_pattern.factory_methord;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:32
 */
abstract public class BaseStore {


    public BaseStore() {

    }

    public abstract Product createProduct(String type);

    public void buyProduct(String type) {
        Product product = createProduct(type);

        System.out.println("Buy product" + product.getName() + " success!");

    }

}
