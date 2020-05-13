package template_pattern.subprocess;

import template_pattern.BaseProcess;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/13 18:03
 */
public class FirstKindProcess extends BaseProcess {

    public FirstKindProcess() {
        super("FirstKindProcess");
    }

    @Override
    public void prepare() {
        System.out.println(this.name+ " is preparing");
    }

    @Override
    public void plan() {
        System.out.println(this.name+ " is planning");

    }

    @Override
    public void doing() {
        System.out.println(this.name+ " is doing");

    }

    @Override
    public void done() {
        System.out.println(this.name+ " is done");
    }
}
