package observer_pattern.subjects;

import observer_pattern.Observer;
import observer_pattern.Subject;

import java.util.ArrayList;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:23
 */
public class FirstSubject implements Subject {

    private ArrayList<Observer> observerArrayList;

    private String data = "";

    public FirstSubject() {
        observerArrayList = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerArrayList) {
            observer.update(data);
        }
    }

    public void changeData(String data){
        this.data = data;
        notifyObservers();
    }
}
