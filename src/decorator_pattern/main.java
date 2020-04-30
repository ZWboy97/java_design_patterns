package decorator_pattern;

import decorator_pattern.decorators.AddTenDecorator;
import decorator_pattern.decorators.MinusTenDecorator;
import decorator_pattern.entities.FirstKindEntity;
import decorator_pattern.entities.SecondKindEntity;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/30 14:56
 */
public class main {

    public static void main(String [] args) throws Exception{
        BaseEntity firstEntity = new FirstKindEntity();
        BaseEntity secondEntity = new SecondKindEntity();

        System.out.println("------装饰类包装之前-----");
        System.out.println(firstEntity.getDescription() +" cost=" +firstEntity.cost());
        System.out.println(secondEntity.getDescription() +" cost=" +secondEntity.cost());

        System.out.println("------装饰类包装之后-----");
        firstEntity = new AddTenDecorator(firstEntity);
        secondEntity = new MinusTenDecorator(secondEntity);

        System.out.println(firstEntity.getDescription() +" cost=" +firstEntity.cost());
        System.out.println(secondEntity.getDescription() +" cost=" +secondEntity.cost());


    }
}
