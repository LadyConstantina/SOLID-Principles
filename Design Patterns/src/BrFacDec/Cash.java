package BrFacDec;

public class Cash implements PaymentMethods{
    @Override
    public void Transfer(double amount) {
        System.out.println("Transfered "+amount+" by cash!");
    }
}
