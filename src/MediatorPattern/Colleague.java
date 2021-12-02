package MediatorPattern;

public abstract class Colleague {
    protected Mediator mediator;      //一个中介者的引用
    protected String name;

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void func();            //执行自己的方法

}

class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void func() {
        System.out.println("执行自己的业务方法");
    }

    //定义依赖方法，与中介者通信，调用中介者的方法
    public void func2() {
        mediator.operation();
    }
    //根据实际情况定义更多依赖方法。。
}