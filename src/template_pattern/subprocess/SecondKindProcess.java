package template_pattern.subprocess;

import template_pattern.BaseProcess;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/13 18:06
 */
public class SecondKindProcess extends BaseProcess {

    public SecondKindProcess() {
        super("SecondKindProcess");
    }

    @Override
    public void prepare() {
        System.out.println("OOOOO " + this.name + " is preparing");
    }

    @Override
    public void plan() {
        System.out.println("OOOOO " + this.name + " is planning");

    }

    @Override
    public void doing() {
        System.out.println("OOOOO " + this.name + " is doing");

    }

    @Override
    public void done() {
        System.out.println("OOOOO " + this.name + " is done");
    }


}
