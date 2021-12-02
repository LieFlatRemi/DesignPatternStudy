package StatePattern;


//正常状态：余额大于等于0
public class NormalState extends State {
    public NormalState(Account account) {
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
        System.out.println("正常状态，无须支付利息！");
    }

    @Override
    public void stateCheck() {
        double curBalance = account.getBalance();
        if (curBalance < 0 && curBalance > -2000) {
            //透支状态
            account.setState(new OverState(account));
        } else if (curBalance == -2000) {
            //受限状态
            account.setState(new RestrictState(account));
        } else if (curBalance < -2000) {
            //受限状态
            account.setState(new RestrictState(account));
            //限制操作
            account.setBalance(-2000);
            System.out.println("操作受限！");
        }
    }
}
