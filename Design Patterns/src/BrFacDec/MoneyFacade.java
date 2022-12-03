package BrFacDec;

public class MoneyFacade {

    public static Money GenerateCurrency(String currency){
        currency = currency.toLowerCase();
        switch (currency){
            case "dollar":
                Money instance1 = new Dollar();
                return instance1;
            case "euro":
                Money instance2 = new Euro();
                return instance2;
            case "mdl":
                Money instance3 = new MDL();
                return instance3;
        }
        return new MDL();
    }
}
