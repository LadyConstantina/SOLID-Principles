package BrFacDec;

public class main {
    public static void main (String[] args){
        OnlineWallet wallet1 = new MAIBwallet(MoneyFacade.GenerateCurrency("Dollar"));
        wallet1.Transfer(200);
        wallet1.Withdraw(10);
        wallet1.Balance();

        OnlineWallet wallet2 = new OTPwallet(MoneyFacade.GenerateCurrency("MDL"));
        wallet2.Transfer(222);
        wallet2.Withdraw(12);
        wallet2.Balance();
    }
}
