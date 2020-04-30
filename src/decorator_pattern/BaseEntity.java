package decorator_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/30 14:42
 */
abstract public class BaseEntity {

    String description = "Unknown Entity";

    public BaseEntity() {

    }

    public BaseEntity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
