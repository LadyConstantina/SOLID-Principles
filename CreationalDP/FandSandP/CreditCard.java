package Constantina.CreationalDP.FandSandP;

public abstract class CreditCard {

    public abstract double HowMuchMoney();
    public abstract double AddMoney(double Add);
    public abstract double GetMoney(double Get);
    public abstract void PrintTransactionHistory();
    public abstract CreditCard Clone();
}
