package MediatorPattern;

import java.util.ArrayList;
//中介者模式
public abstract class Mediator {
    protected ArrayList<Colleague> colleagues;          //在抽象中介者中可以定义一个同事类的集合，用于存储同事对象

    public void register(Colleague colleague) {          //注册方法，用于向集合添加同事对象
        colleagues.add(colleague);
    }

    public abstract void operation();                   //抽象业务方法
}

class ConcreteMediator extends Mediator {
    @Override
    public void operation() {
        colleagues.get(0).func();                       //不同需求不同处理
    }
}