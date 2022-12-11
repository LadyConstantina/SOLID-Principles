package CoRComStr;

public class Add implements Command{

    private PaymentMethod payment;
    private double amount;

    public Add(PaymentMethod payment, double amount){
        this.payment = payment;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.payment.add(amount);
    }
}
