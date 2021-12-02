package StatePattern;

public abstract class State{
    protected Account account;
    public abstract void deposit(double amount);        //存款
    public abstract void withdraw(double amount);       //取款
    public abstract void computeInterest();             //利息
    public abstract void stateCheck();                  //根据余额改变状态
}