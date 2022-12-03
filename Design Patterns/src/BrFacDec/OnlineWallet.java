package BrFacDec;

public abstract class OnlineWallet implements PaymentMethods{

    protected Money money;

    public OnlineWallet(Money m){
        this.money = m;
    }

    abstract public void Balance();
    abstract public void Withdraw(double amount);
    abstract public void Transfer(double amount);
}
