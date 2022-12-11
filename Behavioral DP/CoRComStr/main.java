package CoRComStr;

public class main {
    public static void main (String[] args){
        PaymentMethod method1 = new ByCard("1111222233334444","Tina",123,200);
        PaymentMethod method2 = new ByCash("Santa Claus",50);

        System.out.println();
        System.out.println("Tina order:");

        Order my_order = new Order(120,"Home sweet home!","Something");
        ShipOrder step1 = new PayOrder(method1);
        ShipOrder step2 = new SendOrder();
        ShipOrder step3 = new ReceiveOrder();

        step1.GoNextStep(step2);
        step2.GoNextStep(step3);

        step1.sendPackage(my_order);

        System.out.println();
        System.out.println("Santa order:");

        Order my_order2 = new Order(20,"North Pole","Gift");
        ShipOrder step4 = new PayOrder(method2);
        ShipOrder step5 = new SendOrder();
        ShipOrder step6 = new ReceiveOrder();

        step4.GoNextStep(step5);
        step5.GoNextStep(step6);

        step4.sendPackage(my_order2);
    }
}
