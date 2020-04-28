package observer_pattern;

import observer_pattern.observers.FirstObserver;
import observer_pattern.observers.SecondObserver;
import observer_pattern.subjects.FirstSubject;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:18
 */
public class main {

    public static void main(String [] args) throws Exception{

        FirstSubject firstSubject = new FirstSubject();

        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();

        firstSubject.registerObserver(firstObserver);
        firstSubject.registerObserver(secondObserver);
        firstSubject.changeData(": 哈哈，我变了一次");

        firstSubject.removeObserver(firstObserver);
        firstSubject.changeData(": 哈哈，我变了两次");

    }
}
