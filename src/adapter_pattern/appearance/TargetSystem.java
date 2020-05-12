package adapter_pattern.appearance;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:11
 */
public class TargetSystem {

    GroupOperation groupOperation;

    public TargetSystem(GroupOperation groupOperation) {
        this.groupOperation = groupOperation;
    }

    public void getUp() {
        this.groupOperation.getUp();
    }

    public void getOff() {
        this.groupOperation.getOff();
    }
}
