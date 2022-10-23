package Constantina.CreationalDP.FandSandP;

public class main {
    public static void main (String[] args){
        CreditCard mycard1 = CreditCardFactory.getCreditCard("Dollar", 1000);
        System.out.println("My Card Nr.1:");
        mycard1.HowMuchMoney();
        mycard1.AddMoney(22);
        mycard1.GetMoney(10.75);
        System.out.println("Transaction History for Card Nr.1:");
        mycard1.PrintTransactionHistory();
        CreditCard mycard2 = CreditCardFactory.getCreditCard("Euro", 1111);
        System.out.println("My Card Nr.2:");
        mycard2.HowMuchMoney();
        mycard2.AddMoney(123);
        mycard2.GetMoney(104.75);
        System.out.println("Transaction History for Card Nr.2:");
        mycard2.PrintTransactionHistory();
        CreditCard mycard3 = mycard1.Clone();
        System.out.println("My Card Nr.3:");
        mycard3.HowMuchMoney();
        System.out.println("Transaction History for Card Nr.3:");
        mycard3.PrintTransactionHistory();
        CreditCard mycard4 = mycard2.Clone();
        System.out.println("My Card Nr.4:");
        mycard4.HowMuchMoney();
        System.out.println("Transaction History for Card Nr.4:");
        mycard4.PrintTransactionHistory();
    }
}
