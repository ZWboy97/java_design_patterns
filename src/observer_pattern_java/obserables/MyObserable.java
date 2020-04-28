package observer_pattern_java.obserables;

import java.util.Observable;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:46
 */
public class MyObserable extends Observable {

    private String data;


    public void changeData(String data){
        this.data = data;
        setChanged();
        notifyObservers(data);
    }

}
