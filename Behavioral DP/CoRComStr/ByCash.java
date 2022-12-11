package CoRComStr;

public class ByCash implements PaymentMethod{

    protected String person;
    protected double amount;

    public ByCash(String name, double amount){
        this.person = name;
        this.amount = amount;
        System.out.println("Created cash wallet for "+name+" with "+amount+"$");
    }

    @Override
    public void pay(double amount_to_pay) {
        System.out.println(person+" payed "+amount_to_pay+"$");
        this.amount = this.amount - amount_to_pay;
        System.out.println("Current cash balance: "+amount+"$");
    }

    @Override
    public void add(double amount) {
        this.amount = this.amount+amount;
        System.out.println(amount+"$ were added to "+person+" account in cash!");
    }
}
