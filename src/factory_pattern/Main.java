package factory_pattern;

import factory_pattern.abstract_factory.factorys.AFactory;
import factory_pattern.abstract_factory.factorys.BFactory;
import factory_pattern.abstract_factory.stores.AStore;
import factory_pattern.abstract_factory.stores.BStore;
import factory_pattern.factory_methord.stores.FirstStore;
import factory_pattern.factory_methord.stores.SecondStore;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/2 22:30
 */
public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("------使用工厂方法模式--------");
        FirstStore firstStore = new FirstStore();
        SecondStore secondStore = new SecondStore();
        firstStore.buyProduct("first");
        firstStore.buyProduct("second");
        secondStore.buyProduct("first");
        secondStore.buyProduct("second");

        System.out.println("-------使用抽象工厂模式--------");
        AStore aStore = new AStore(new AFactory());
        BStore bStore = new BStore(new BFactory());

        aStore.buyProduct("first");
        aStore.buyProduct("second");
        bStore.buyProduct("first");
        bStore.buyProduct("second");
    }


}
