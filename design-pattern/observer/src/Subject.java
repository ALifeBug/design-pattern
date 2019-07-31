import java.util.ArrayList;
import java.util.List;

/**
 * Created by sccy on 2019/7/30/0030.
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();
    //增加观察者方法
    public void add(Observer observer){
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyObserver();//通知观察者方法
}
