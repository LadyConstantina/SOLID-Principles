package BrFacDec;

public class MAIBwallet extends OnlineWallet {
    public MAIBwallet(Money m){
        super(m);
    }

    @Override
    public void Balance() {
        System.out.println("The balance of your MAIB wallet: ");
        money.Balance();
    }

    @Override
    public void Withdraw(double amount) {
        System.out.println("The balance of your MAIB wallet: ");
        money.Withdraw(amount);
    }

    @Override
    public void Transfer(double amount) {
        System.out.println("The balance of your MAIB wallet: ");
        money.Transfer(amount);
    }
}
