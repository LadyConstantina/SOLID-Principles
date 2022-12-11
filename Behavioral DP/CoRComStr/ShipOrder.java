package CoRComStr;

public interface ShipOrder {

    void GoNextStep (ShipOrder NextStep);
    void sendPackage(Order order);
}
