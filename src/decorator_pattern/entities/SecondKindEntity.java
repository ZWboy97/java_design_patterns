package decorator_pattern.entities;

import decorator_pattern.BaseEntity;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/30 14:50
 */
public class SecondKindEntity extends BaseEntity {

    public SecondKindEntity() {
        super("SecondKindEntity");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
