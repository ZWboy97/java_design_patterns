package template_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/13 18:01
 */
abstract public class BaseProcess {

    protected String name;

    public BaseProcess(String name) {
        this.name = name;
    }

    public void process(){
        prepare();
        plan();
        doing();
        done();
    }

    abstract public void prepare();

    abstract public void plan();

    abstract public void doing();

    abstract public void done();

}
