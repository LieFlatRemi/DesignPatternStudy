package StatePattern;

//限制状态：余额等于-2000
public class RestrictState extends State {
    public RestrictState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("受限状态，不能取款！");
    }

    @Override
    public void computeInterest() {
        System.out.println("按天计算利息");
    }

    @Override
    public void stateCheck() {
        if(account.getBalance() >= 0){
            //正常状态
            account.setState(new NormalState(account));
        } else if(account.getBalance() > -2000){
            account.setState(new OverState(account));
        }
    }
}
