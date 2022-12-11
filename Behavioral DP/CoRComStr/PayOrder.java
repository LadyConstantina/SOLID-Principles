package CoRComStr;

public class PayOrder implements ShipOrder{

    private ShipOrder Step;
    private PaymentMethod payment;

    public PayOrder(PaymentMethod payment){
        this.payment = payment;
    }

    @Override
    public void GoNextStep(ShipOrder NextStep) {
        this.Step = NextStep;
    }

    @Override
    public void sendPackage(Order order) {
        double amount = order.getPrice();
        Pay pay_command = new Pay(payment,amount);
        PayInvoker pay_process = new PayInvoker(pay_command);
        pay_process.execute();

        System.out.println("Order has been payed for!");
        this.Step.sendPackage(order);
    }
}
