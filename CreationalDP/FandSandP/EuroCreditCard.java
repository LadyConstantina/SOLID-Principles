package Constantina.CreationalDP.FandSandP;

import java.util.ArrayList;
import java.util.List;

public class EuroCreditCard extends CreditCard{

    private double Money;
    private List<String> Transaction_History = new ArrayList<String>();

    public EuroCreditCard(){
        this.Money = 0;
    }

    public EuroCreditCard(double money){
        this.Money = money;
    }

    private EuroCreditCard(double money,List<String> history){
        this.Money = money;
        this.Transaction_History = history;
    }

    @Override
    public double HowMuchMoney() {
        System.out.println("Current balance: "+this.Money+"€");
        return this.Money;
    }

    @Override
    public double AddMoney(double Add) {
        this.Money = this.Money + Add;
        this.Transaction_History.add("Added "+Add+"€");
        System.out.println("Current balance: "+this.Money+"€ Added money: "+Add+"€");
        return this.Money;
    }

    @Override
    public double GetMoney(double Get) {
        this.Money = this.Money - Get;
        this.Transaction_History.add("Extracted "+Get+"€");
        System.out.println("Current balance: "+this.Money+"€ Withdrawn money: "+Get+"€");
        return this.Money;
    }

    @Override
    public void PrintTransactionHistory() {
        for (int i = 0; i < this.Transaction_History.size(); i++) {
            System.out.println("Trnasaction nr "+i+" "+this.Transaction_History.get(i));
        }
    }

    @Override
    public CreditCard Clone(){
        double money_to_new_wallet = this.Money;
        List<String> Transaction_History_Temp = this.Transaction_History;
        return new EuroCreditCard(money_to_new_wallet,Transaction_History_Temp);
    }
}
