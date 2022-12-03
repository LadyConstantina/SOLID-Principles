package BrFacDec;

public class VictoriaBankwallet extends OnlineWallet {
    public VictoriaBankwallet(Money m){
        super(m);
    }

    @Override
    public void Balance() {
        System.out.println("The balance of your Victoria Bank wallet: ");
        money.Balance();
    }

    @Override
    public void Withdraw(double amount) {
        System.out.println("The balance of your Victoria Bank wallet: ");
        money.Withdraw(amount);
    }

    @Override
    public void Transfer(double amount) {
        System.out.println("The balance of your Victoria Bank wallet: ");
        money.Transfer(amount);
    }
}
