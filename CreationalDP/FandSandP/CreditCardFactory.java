package Constantina.CreationalDP.FandSandP;

public class CreditCardFactory {

    private static CreditCard instance;

    private CreditCardFactory(){}

    public static CreditCard getCreditCard(String currency, float Money){
        if ("Dollar".equalsIgnoreCase(currency)) instance = new DollarCreditCard(Money);
        else if("Euro".equalsIgnoreCase(currency)) instance = new EuroCreditCard(Money);

        return instance;
    }
}
