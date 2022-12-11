package CoRComStr;

public class ReceiveOrder implements ShipOrder{

    private ShipOrder Step;
    private String Address_to_ship;

    @Override
    public void GoNextStep(ShipOrder NextStep) {
        this.Step = NextStep;
    }

    @Override
    public void sendPackage(Order order) {
        Address_to_ship = order.getAddress();
        System.out.println("Order delivered successfully to "+Address_to_ship);
        //this.Step.sendPackage(order);
    }
}
