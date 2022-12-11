package CoRComStr;

public class ByCard implements PaymentMethod{

    protected String card_number;
    protected String provider;
    protected int CCV;
    protected double money;


    public ByCard (String card_number, String name, int CCV, double amount){
        this.card_number = card_number;
        this.provider = name;
        this.CCV = CCV;
        this.money = amount;
        System.out.println("Created card for "+name+" with "+amount+"$");
    }

    @Override
    public void pay(double amount) {
        System.out.println(provider+" payed "+amount+"$");
        this.money = this.money - amount;
        System.out.println("Current card balance: "+money+"$");
    }

    @Override
    public void add(double amount) {
        this.money = this.money + amount;
        System.out.println(amount+"$ were added to "+provider+" account on card!");
    }
}
