package BrFacDec;

public class OTPwallet extends OnlineWallet {
    public OTPwallet(Money m){
        super(m);
    }

    @Override
    public void Balance() {
        System.out.println("The balance of your OTP Bank wallet: ");
        money.Balance();
    }

    @Override
    public void Withdraw(double amount) {
        System.out.println("The balance of your OTP Bank wallet: ");
        money.Withdraw(amount);
    }

    @Override
    public void Transfer(double amount) {
        System.out.println("The balance of your OTP Bank wallet: ");
        money.Transfer(amount);
    }
}
