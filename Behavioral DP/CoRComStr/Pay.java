package CoRComStr;

public class Pay implements Command{

    private PaymentMethod payment;
    private double amount;

    public Pay(PaymentMethod payment, double amount){
        this.payment = payment;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.payment.pay(amount);
    }
}
