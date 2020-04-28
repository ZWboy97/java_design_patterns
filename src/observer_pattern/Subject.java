package observer_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:19
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
