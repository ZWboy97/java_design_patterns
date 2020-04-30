package decorator_pattern.entities;

import decorator_pattern.BaseEntity;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/30 14:45
 */
public class FirstKindEntity extends BaseEntity {

    public FirstKindEntity(){
        super("FirstKindEntity");
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
