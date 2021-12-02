package StatePattern;

//透支状态：余额小于0大于-2000
public class OverState extends State{
    public OverState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        if(account.getBalance() >= 0){
            //正常状态
            account.setState(new NormalState(account));
        } else if(account.getBalance() == -2000){
            //限制状态
            account.setState(new RestrictState(account));
        }else if(account.getBalance() < -2000){
            //限制状态
            account.setState(new RestrictState(account));
            //限制操作
            account.setBalance(-2000);
            System.out.println("操作受限！");
        }
    }
}
