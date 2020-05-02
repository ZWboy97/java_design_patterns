package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.product_a.ProductA;
import factory_pattern.abstract_factory.product_b.ProductB;

/**
 * 用于创建一个产品组
 *
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:50
 */
public interface Factory {

    ProductA createProductA(String type);

    ProductB createProductB(String type);

}
