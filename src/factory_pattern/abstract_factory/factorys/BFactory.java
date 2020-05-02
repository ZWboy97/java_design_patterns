package factory_pattern.abstract_factory.factorys;

import factory_pattern.abstract_factory.Factory;
import factory_pattern.abstract_factory.product_a.FirstProductA;
import factory_pattern.abstract_factory.product_a.ProductA;
import factory_pattern.abstract_factory.product_a.SecondProductA;
import factory_pattern.abstract_factory.product_b.FirstProductB;
import factory_pattern.abstract_factory.product_b.ProductB;
import factory_pattern.abstract_factory.product_b.SecondProductB;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 23:00
 */
public class BFactory implements Factory {

    @Override
    public ProductA createProductA(String type) {
        if (type == "first") {
            return new FirstProductA("Pfirst");
        } else if (type == "second") {
            return new SecondProductA("Psecond");
        }
        return null;
    }

    @Override
    public ProductB createProductB(String type) {
        if (type == "first") {
            return new FirstProductB("Pa");
        } else if (type == "second") {
            return new SecondProductB("Pb");
        }
        return null;
    }
}
