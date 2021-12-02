package ObserverPattern;

//观察者模式

import java.util.ArrayList;
import java.util.List;

//被观察目标的抽象类
public abstract class Subject {
    //观察者集合
    protected List<Observer> observers = new ArrayList<>();

    //添加观察者
    public void attach(Observer ob) {
        observers.add(ob);
    }

    //删除观察者
    public void detach(Observer ob) {
        observers.remove(ob);
    }

    public abstract void notifyObserver();      //抽象通知方法
}
