package decorator_pattern.decorators;

import decorator_pattern.BaseDecorator;
import decorator_pattern.BaseEntity;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/30 14:52
 */
public class AddTenDecorator extends BaseDecorator {

    BaseEntity entity;

    public AddTenDecorator(){}

    public AddTenDecorator(BaseEntity entity) {
        this.entity = entity;
    }

    @Override
    public String getDescription() {
        return entity.getDescription() + " Add 10 Decorator";
    }

    @Override
    public double cost() {
        return entity.cost() + 10.0;
    }
}
